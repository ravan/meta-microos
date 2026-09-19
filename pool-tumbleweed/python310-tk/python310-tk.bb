SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "python310-tk-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "d68cdba08c231effe030a471fd52a2033e0cffa58682d7f9c763c92d42d99c2d6ee02825c3ce93bb30f6139f29c9d60c346832abd4e303aedabe53ad52fb2b2b"

RPROVIDES:${PN} += "python310-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python310"

inherit rpm
