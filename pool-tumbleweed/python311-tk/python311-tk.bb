SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "python311-tk-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "3d8313f3d6997dcd91cb39ed0584380362fbf095620b3d6930f74a3ddabdd9b000e0665ea294335695fa6a176b2b42d9fddd478694423fe24ad29f176b44645a"

RPROVIDES:${PN} += "python311-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python311"

inherit rpm
