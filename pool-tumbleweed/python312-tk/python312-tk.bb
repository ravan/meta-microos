SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-tk-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "1b882f90aa98203344c2aafdcea514337874883e1b8f43893471b8dd938cab0898d44b8fc709d60098f93def767586097fd564f595f3fcf5271103906a4710d2"

RPROVIDES:${PN} += "python312-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python312"

inherit rpm
