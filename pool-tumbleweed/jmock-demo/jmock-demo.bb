SUMMARY = "Test Java code using mock objects"
DESCRIPTION = "jMock is a library for testing Java code using mock objects. Mock \
   objects help you design and test the interactions between the \
   objects in your programs. The jMock package: * makes it quick and \
   easy to define mock objects, so you don't break the rhythm of \
   programming. \
 \
* lets you define flexible constraints over object interactions, \
   reducing the brittleness of your tests. \
 \
* is easy to extend."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "jmock-demo-1.2.0-31.9.noarch.rpm"
RPM_HASH = "ab22076a2e54e430497489b142ec5a92122b0d8378f14a9a92b33f9c671dd852da700e247e17eec485656e6360dfb6ec6a2a69f77b34e9c62a90e86da9e01952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock-demo"

RDEPENDS:${PN} += ""

inherit rpm
