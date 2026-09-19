SUMMARY = "Prometheus Java Simpleclient BOM"
DESCRIPTION = "Bill of Materials for the Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-bom-0.16.0-2.2.noarch.rpm"
RPM_HASH = "ddec665e6aed6270c2f4a059b32d0d7d8956d057e7b72169a377796e289a8f28a59f60a073763bfb10ea21a4b4755956482eb5374013ea9f5dc7d5045547ff9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-bom-pom- \
prometheus-simpleclient-java-bom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-parent-pom-"

inherit rpm
