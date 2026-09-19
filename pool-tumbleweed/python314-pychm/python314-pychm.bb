SUMMARY = "Python package to handle CHM files"
DESCRIPTION = "The chm package provides three modules, chm, chmlib and extra, which \
provide access to the API implemented by the C library chmlib and some \
additional classes and functions. They are used to access MS-ITSS encoded \
files - Compressed Html Help files (.chm)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "python314-pychm-0.8.6-3.7.aarch64.rpm"
RPM_HASH = "e51f6fa2bbca0871aca7245a0ab8a631af8c6506e89e834dad6f1a3ee79b2df7bad5eaa4c93905c0f19f795b6f6beeef4085a4ae18acabac77f1bc0ccd9edb97"

RPROVIDES:${PN} += "python3.14dist-pychm \
python314-pychm \
python3dist-pychm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
python-abi"

inherit rpm
