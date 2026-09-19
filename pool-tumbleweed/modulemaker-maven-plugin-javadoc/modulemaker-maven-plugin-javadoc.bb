SUMMARY = "API documentation for modulemaker-maven-plugin"
DESCRIPTION = "API documentation for modulemaker-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.11"

RPM_NAME = "modulemaker-maven-plugin-javadoc-1.11-1.11.noarch.rpm"
RPM_HASH = "1fa890056f5b53485abf443df33330c6159531469237ce6cc4288f8199b02949d9296ecea0adb40a8c92faaf5c9274d7cc8bc910b6379d6bc00b511c25362ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modulemaker-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
