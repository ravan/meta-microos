SUMMARY = "API documentation for felix-utils"
DESCRIPTION = "This package contains the API documentation for felix-utils."
LICENSE = "Apache-2.0"

PV = "1.11.4"

RPM_NAME = "felix-utils-javadoc-1.11.4-3.9.noarch.rpm"
RPM_HASH = "8ab64d03468f66646a3d9ae24ee765d90afc4a83bb50921ed71ff0348166d8eba6cd7d9d570b0ab0012b56b012fdcf414cc50fcdbf04f6627d9fe8289b67ae48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-utils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
