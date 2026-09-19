SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "python314-JPype1-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "574ffea031f212ed63fee51ad9d413f1ec331ca48053543366e26056c1e6414b01bba910b6e654460141b225283b50f3e9bfcf27cef254253e6ef996c4b73b92"

RPROVIDES:${PN} += "python3.14dist-jpype1 \
python314-JPype1 \
python3dist-jpype1"

RDEPENDS:${PN} += "java-headless \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
