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

RPM_NAME = "jmock-javadoc-1.2.0-31.9.noarch.rpm"
RPM_HASH = "790f220917c77a19278722650c7686ff645532c2c2dcf617fddc24f59de33a6d3149f7a8f72072e18e2445c150839464c5bcf3b7f253da2254163fc41a21375d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmock-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
