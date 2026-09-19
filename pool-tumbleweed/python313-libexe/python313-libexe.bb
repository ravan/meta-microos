SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "python313-libexe-20260705-1.2.aarch64.rpm"
RPM_HASH = "dbed616ea7b0db26381fa488724a2956c10ed5f99c6127d39480c4e54920cd95d5f2d6918587d04b3977ce079179a247442136c7131130ba8bc41ff25a332210"

RPROVIDES:${PN} += "python3-libexe \
python313-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
