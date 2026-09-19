SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.1"

RPM_NAME = "python313-pyxattr-0.8.1-2.7.aarch64.rpm"
RPM_HASH = "903864189c634b4b0d6354e5d2deee828e0e60ea586ac2251a2377373a1bd96532436acd945b9766304b13a579e01ca11e4f5fff6718514642968827b860fb64"

RPROVIDES:${PN} += "python3-pyxattr \
python3.13dist-pyxattr \
python313-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
