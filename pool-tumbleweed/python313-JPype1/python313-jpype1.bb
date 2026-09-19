SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "python313-JPype1-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "f3528c6afc21ae49025616ec4a6e215437805495d4147e279e372ad9aee73d3eeb778141e3a9e62677da42da8775e04f7d8ecb7aabef4c95eb9b7f5e5f178b98"

RPROVIDES:${PN} += "python3-JPype1 \
python3.13dist-jpype1 \
python313-JPype1 \
python3dist-jpype1"

RDEPENDS:${PN} += "java-headless \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
