SUMMARY = "Utilities for reading BIN/ISO/CUE image files through libodraw"
DESCRIPTION = "This subpackage contains the utility programs from libodraw, which \
can read optical disc (split) RAW image files such as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libodraw-tools-20240505-1.24.aarch64.rpm"
RPM_HASH = "73042f134fd0570022ad3feecb06b32e42f26b682c459ecf31905dc0edb53238fec42af71a7310ec3c296ed9ceceaaa7f52a5c7a2adcbb471662675425e805dd"

RPROVIDES:${PN} += "libodraw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libhmac.so.1 \
libodraw.so.1 \
libodraw1"

inherit rpm
