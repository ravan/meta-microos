SUMMARY = "Web safe object pickling/unpickling"
DESCRIPTION = "The rencode module is a modified version of bencode from the \
BitTorrent project.  For complex, heterogeneous data structures with \
many small elements, r-encodings take up significantly less space than \
b-encodings. Python2 version of package"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "python314-rencode-1.0.8-2.7.aarch64.rpm"
RPM_HASH = "36aaf102dadaacd7c15e87992b5697f92e9677619b1fa76470d7045bca0dbb65316aed73242e25161a528a51feb381d16afb273dfe22acf3fe9770ad8741be02"

RPROVIDES:${PN} += "python3.14dist-rencode \
python314-rencode \
python3dist-rencode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
