SUMMARY = "Web safe object pickling/unpickling"
DESCRIPTION = "The rencode module is a modified version of bencode from the \
BitTorrent project.  For complex, heterogeneous data structures with \
many small elements, r-encodings take up significantly less space than \
b-encodings. Python2 version of package"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "python313-rencode-1.0.8-2.7.aarch64.rpm"
RPM_HASH = "9c0ac4a60fa5e003fd94f00996872983fcfadee1b6ba6909bdac547fed228ff80fbbf37d8660a2c53819b8edc986d22f7208e9eeda5d1ae5af1754b3a0ddaad6"

RPROVIDES:${PN} += "python3-rencode \
python3.13dist-rencode \
python313-rencode \
python3dist-rencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
