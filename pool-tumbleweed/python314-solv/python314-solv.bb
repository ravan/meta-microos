SUMMARY = "Python bindings for the libsolv library"
DESCRIPTION = "Python bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "python314-solv-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "82b5ad72cebc028c048095c4b8faf066769b0b9c8701879809497c468c32367509a88544c7053c2b0f9472926c2dc1fbc135f01a06fe2e2f006549ba435ffbd1"

RPROVIDES:${PN} += "python314-solv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1 \
python-abi"

inherit rpm
