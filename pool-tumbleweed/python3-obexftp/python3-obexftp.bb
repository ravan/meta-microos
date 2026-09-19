SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Python3 bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the python3 bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "python3-obexftp-0.24.2-3.10.aarch64.rpm"
RPM_HASH = "0ac4bfa91723c39905bac0d296ffe26ba1054f2464efc96c2b5e972d5de14675377e04a9dc62d4246fcfc6e69a45214b3e875701546f036e6061964b40ff8673"

RPROVIDES:${PN} += "python3-obexftp"

RDEPENDS:${PN} += "libc.so.6 \
libobexftp.so.0 \
obexftp \
python-abi"

inherit rpm
