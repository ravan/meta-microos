SUMMARY = "JTS Examples"
DESCRIPTION = "Examples of working JTS code."
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-example-1.20.0-1.6.noarch.rpm"
RPM_HASH = "42feb69069e6d449c8eae910c18f9f821e517e6b3fc3f6cc5628c94f344946bbaad20663ef01b7915cc1d07a7ef0bcfebe6d1403374dc447492008e225670efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts-example \
mvn-org.locationtech.jts-jts-example \
mvn-org.locationtech.jts-jts-example-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.locationtech.jts-jts-core"

inherit rpm
