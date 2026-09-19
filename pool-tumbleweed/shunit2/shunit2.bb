SUMMARY = "Test Framework for Bourne Based Shell Scripts"
DESCRIPTION = "shUnit2 is a xUnit unit test framework for Bourne based shell scripts, \
and it is designed to work in a similar manner to JUnit, PyUnit, etc. \
If you have ever had the desire to write a unit test for a shell \
script, shUnit2 can do the job."
LICENSE = "Apache-2.0"

PV = "2.1.8"

RPM_NAME = "shunit2-2.1.8-2.6.noarch.rpm"
RPM_HASH = "b67fa3f97aac4ba932d8073193a6671511bc908314a9f5ea8bca9fd61ea30e3c709ea195727538e2db0f1e59571f683ee0d06222ada040f7a104eee2c9c813f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shunit2"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
