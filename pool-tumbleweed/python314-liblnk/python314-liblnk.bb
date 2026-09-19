SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "python314-liblnk-20260525-1.10.aarch64.rpm"
RPM_HASH = "7c325ed3f7eeb536f7dcd631bb9aff7ae993ccfcabdb0ae2b43f8bfa8864573b52b74731f5d9a0de746bad84bb09f7a34cff064e010ea449030358fb8c540c37"

RPROVIDES:${PN} += "python314-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
