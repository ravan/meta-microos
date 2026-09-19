SUMMARY = "Multi-Schema Validator Core"
DESCRIPTION = "Multi-Schema Validator Core."
LICENSE = "Apache-1.1 & BSD-3-Clause & Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "2013.6.1"

RPM_NAME = "msv-msv-2013.6.1-7.2.noarch.rpm"
RPM_HASH = "ddbcfc45a77c79ca060bade0a4d64101cd3fc46975f4314780869b99af1c1c17eb9523fe245a99d87dc28319d55fc77b8a0d122af199062192434635a4cfc7d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-msv \
mvn-net.java.dev.msv-msv-core \
mvn-net.java.dev.msv-msv-core-pom- \
osgi-net.java.dev.msv.core"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-isorelax-isorelax \
mvn-net.java.dev.msv-xsdlib \
mvn-xml-resolver-xml-resolver"

inherit rpm
