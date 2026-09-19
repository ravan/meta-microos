SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "15.3.0+git11272"

RPM_NAME = "libitm1-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "5fdbcf5b3d2ca96c89614e8f980629bf8c472911d39abf25554198e8ca22d6a7b9aeae698d9f8a46cdd8f650bf497425a85ca3ef5b5c608acbd77d1c5c06705f"

RPROVIDES:${PN} += "libitm.so.1 \
libitm1 \
libitm1-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
