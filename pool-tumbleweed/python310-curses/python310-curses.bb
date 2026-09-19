SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "python310-curses-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "b96197d29d3eb49467391b3ed51d1a1cba0ae36e934de11e2d1d21a644e9cc96c1148cbded58c23c4917b104abd8b78b9d8a2958d1c1afb959bdb09347e84ecf"

RPROVIDES:${PN} += "python310-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python310"

inherit rpm
