SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "python313-liblnk-20260525-1.10.aarch64.rpm"
RPM_HASH = "2fd82267f5ef03f6645f61177747492f3071148e5dddcd987be77d4a2449d53458b45a04febdb63a1d7245e00f7b548edefc097de513df51246f972024c701f0"

RPROVIDES:${PN} += "python3-liblnk \
python313-liblnk"

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
