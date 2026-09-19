SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "python313-tk-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "fbe4ed74a25d9f66bfd41316c82205fb03aa693624a7ce6758332cfd8afc6da24048f7a5846901cf08a6339272f9b1c4fe5c296e3d108d50324d72eb2a0ee4f3"

RPROVIDES:${PN} += "python3-tk \
python313-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python313"

inherit rpm
