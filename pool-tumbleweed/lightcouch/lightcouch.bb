SUMMARY = "CouchDB Java API"
DESCRIPTION = "LightCouch is a Java API for communicating with CouchDB database. \
It aims at providing a flexible and easy-to-use APIs with minimal \
code-base and dependency."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "lightcouch-0.2.0-1.18.noarch.rpm"
RPM_HASH = "08fc1a1f60b3fec4dd7b9d6d41d215219cf27fd223d33314607e7f70705b5c16724b11a2af9a0b6001d8a457c8a53b506ff6d489786731c3d7f74d5865b70de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightcouch \
mvn-org.lightcouch-lightcouch \
mvn-org.lightcouch-lightcouch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.gson-gson \
mvn-org.apache.httpcomponents-httpclient"

inherit rpm
