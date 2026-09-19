SUMMARY = "Javadoc for felix-gogo-runtime"
DESCRIPTION = "This package contains the API documentation for felix-gogo-runtime."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "felix-gogo-runtime-javadoc-1.1.6-1.10.noarch.rpm"
RPM_HASH = "6be737501ddf6931baf8c4f9480680db14e879fb4335bc89d45a5ca9aa20bd2aba2c16793a1498a92074f14b59a0141425db18a30444d22059100564e738e06c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-runtime-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
