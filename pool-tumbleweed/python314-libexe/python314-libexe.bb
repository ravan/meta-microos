SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "python314-libexe-20260705-1.2.aarch64.rpm"
RPM_HASH = "8c3ee46d61811fffece52661d3fe6cea1a41684e4fb3f618f8098126a8fcce252212b1485590a03cf3ad215dac064d65e2e38081cd0b156f0b7f2a7ee70d4cdc"

RPROVIDES:${PN} += "python314-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
