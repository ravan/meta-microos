SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "python314-tk-3.14.7-1.1.aarch64.rpm"
RPM_HASH = "0a49dc9c74a06d76fb32071b9bf4b4ed0aaff8d2270c7c0f3ca07b361f5eb0711fcfb086f571b8800805a700e41f5185377eb6828b7134f273dc533736e8d5c5"

RPROVIDES:${PN} += "python314-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python314"

inherit rpm
