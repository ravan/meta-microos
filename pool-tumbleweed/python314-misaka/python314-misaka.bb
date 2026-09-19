SUMMARY = "A CFFI binding for Hoedown, a markdown parsing library"
DESCRIPTION = "A CFFI binding for Hoedown_ (version 3), a markdown parsing library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python314-misaka-2.1.1-4.7.aarch64.rpm"
RPM_HASH = "8e9f515e3dfb82da042c8a7fa19cef3687509e925933b4caf4f3254e855ebcb8ba4fec5efa7379381f566a7c558b44829407ebd928d8d27cb049e48af051c8d8"

RPROVIDES:${PN} += "python3.14dist-misaka \
python314-misaka \
python3dist-misaka"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-cffi"

inherit rpm
