SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-tk-3.15.0~rc2-1.1.aarch64.rpm"
RPM_HASH = "8bc11de4e101cac40c4f35173a93ba2a7cf72401b5e668ae276d070656edf535577b1cf2d65f3ffc903fe45e7a2e828d7e752105b071139214b74cfc4cc0463a"

RPROVIDES:${PN} += "python315-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python315"

inherit rpm
