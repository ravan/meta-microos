SUMMARY = "Multi-Schema Validator RNG Converter"
DESCRIPTION = "Multi-Schema Validator RNG Converter."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-rngconv-2013.6.1-7.2.noarch.rpm"
RPM_HASH = "b3d1e27d8233385b2a342470364e87f891320e7877b2884e844edc276ec98d0f05d4c7087341ab5048b4085b58308d6099343f319c07ba547169473d2ea0c13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-rngconv \
mvn-net.java.dev.msv-msv-rngconverter \
mvn-net.java.dev.msv-msv-rngconverter-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-net.java.dev.msv-msv-core \
mvn-net.java.dev.msv-xsdlib \
mvn-xerces-xercesImpl \
mvn-xml-resolver-xml-resolver"

inherit rpm
