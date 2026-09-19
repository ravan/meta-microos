SUMMARY = "A collection of source code generators for Java"
DESCRIPTION = "The Auto sub-projects are a collection of code generators \
that automate those types of tasks."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-1.6.1-3.4.noarch.rpm"
RPM_HASH = "f23fc86c37667ae8f9515b98a4a0352ebfad4d388e16fe0c9b1622c96d87223fd5c121a239b20617c29880aa95004f737fb0d15b2acd5e5a4f0b29e661eb751c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto \
mvn-com.google.auto-auto-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
