SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20240502"

RPM_NAME = "python314-libfvde-20240502-2.20.aarch64.rpm"
RPM_HASH = "3fa3df9c0565cf6bf8799c606adb7d8838bf11eee4b404d52836d76fb4cd242744a0d89953364bcbb6e72f656f05c48493283121f521aa6153cb8170f8965c24"

RPROVIDES:${PN} += "python314-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
