SUMMARY = "Java Foreign Function Interface"
DESCRIPTION = "An optimized Java interface to libffi."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "jffi-1.3.13-3.4.aarch64.rpm"
RPM_HASH = "d3b33c7931d3aac2035865e6fa604e529d7393185694f013ddd5c74095d7b7965fcb66bb9c865877d7f24ca5e57d4d113d893d413805a3450b36fc2f273e53f1"

RPROVIDES:${PN} += "jffi \
mvn-com.github.jnr-jffi \
mvn-com.github.jnr-jffi-pom- \
osgi-com.github.jnr.jffi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
