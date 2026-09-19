SUMMARY = "Python module to patch python built-in objects"
DESCRIPTION = "This project allows you to patch built-in objects, declared in C through \
python."
LICENSE = "GPL-3.0-only | MIT"

PV = "0.1.4"

RPM_NAME = "python314-forbiddenfruit-0.1.4-4.2.aarch64.rpm"
RPM_HASH = "b8caabea98954ea127f11762213348124bfd35873c73364f2fefc7f505676e892d7d4714aa4c4694f1f786378f502e120fe08ec311128408f053e406983d16bb"

RPROVIDES:${PN} += "python3.14dist-forbiddenfruit \
python314-forbiddenfruit \
python3dist-forbiddenfruit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
