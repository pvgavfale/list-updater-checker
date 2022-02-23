package com.test;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Objects;

import java.util.Optional;

import com.test.pojo.EmpInfo;

public class JavaTest {

	public static void main(String[] args) {

		List<EmpInfo> dbList = returnDbList();

		List<EmpInfo> psfseList = returnPsfseList();

		System.out.println("dbList " + Arrays.deepToString(dbList.toArray()));

		System.out.println("psfseList " + Arrays.deepToString(psfseList.toArray()));

		dbList.forEach(dbElement -> {

			Optional<EmpInfo> matchingElement = psfseList.stream()

					.filter(e -> Objects.equals(e.getName(), dbElement.getName())).findFirst();

			if (matchingElement.isPresent()) {

				dbElement.setValue(matchingElement.get().getValue());

			}

		});

		System.out.println("dbList " + dbList);

		System.out.println("psfseList " + psfseList);

	}

	private static List<EmpInfo> returnPsfseList() {

		List<EmpInfo> psfseList = new ArrayList<>();

		for (int i = 0; i < 2; i++) {

			EmpInfo empInfor = new EmpInfo("Test" + i, "1" + i, "10");

			psfseList.add(empInfor);

		}

		return psfseList;

	}

	public static List<EmpInfo> returnDbList() {

		List<EmpInfo> dbList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			EmpInfo empInfor = new EmpInfo("Test" + i, "1" + i, "20");

			dbList.add(empInfor);

		}

		return dbList;

	}

}