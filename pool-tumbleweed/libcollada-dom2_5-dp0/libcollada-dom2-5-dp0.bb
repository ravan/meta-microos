SUMMARY = "The COLLADA Document Object Model (DOM) runtime C++ Library"
DESCRIPTION = "The COLLADA Document Object Model (DOM) runtime C++ Library \
 \
The COLLADA Document Object Model (DOM) is an application programming \
interface (API) that provides a C++ object representation of a COLLADA XML \
instance document."
LICENSE = "MIT"

PV = "2.5.1+git20200104.c1e20b7"

RPM_NAME = "libcollada-dom2_5-dp0-2.5.1+git20200104.c1e20b7-5.1.aarch64.rpm"
RPM_HASH = "f4410d4b46b61601e59eca1b2e860945e4e79a555d60a27f1154833831208d91267e2a36f6749a746237fa661eff24f1dff21d4d1a87b61bd9b85827a5b0f934"

RPROVIDES:${PN} += "libcollada-dom2-5-dp0 \
libcollada-dom2.5-dp.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libminizip.so.1 \
libstdc++.so.6 \
liburiparser.so.1 \
libxml2.so.16"

inherit rpm
