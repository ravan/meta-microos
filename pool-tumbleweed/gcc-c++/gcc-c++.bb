SUMMARY = "The system GNU C++ Compiler"
DESCRIPTION = "The system GNU C++ Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-c++-16-1.1.aarch64.rpm"
RPM_HASH = "178c0db303d11693997c99a64089e6c1e842246f17ffa9e625a6cc410eeba2c2eed5fd6fb717820a1129e70737de296f7951734a2bedd649a58c1b434ae05458"

RPROVIDES:${PN} += "c++-compiler \
gcc-c++"

RDEPENDS:${PN} += "gcc \
gcc16-c++"

inherit rpm
