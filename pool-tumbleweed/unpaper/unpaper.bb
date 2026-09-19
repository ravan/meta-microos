SUMMARY = "Post-Processing Tool for Scanned Text Pages"
DESCRIPTION = "The unpaper command line tool helps with post-processing scanned text \
pages, especially with	book pages scanned from photocopies. unpaper \
tries to remove dark edges, corrects the rotation ('deskewing'), and \
aligns the centering of pages."
LICENSE = "GPL-2.0-or-later"

PV = "7.0.0"

RPM_NAME = "unpaper-7.0.0-1.26.aarch64.rpm"
RPM_HASH = "323a7e4a667f9fac8c9b0f6e985ba1215f38b4bb04db37814c88eec48ee9ddf1a027721f2422f328e9cf83e550023906c9421f94b036757388ce0addce3191f2"

RPROVIDES:${PN} += "unpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libm.so.6"

inherit rpm
