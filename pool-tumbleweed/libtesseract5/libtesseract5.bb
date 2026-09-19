SUMMARY = "Open Source OCR Engine"
DESCRIPTION = "A commercial quality OCR engine originally developed at HP between 1985 and \
1995. In 1995, this engine was among the top 3 evaluated by UNLV. It was \
open-sourced by HP and UNLV in 2005. From 2007 it is developed by Google."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.5.3"

RPM_NAME = "libtesseract5-5.5.3-1.1.aarch64.rpm"
RPM_HASH = "622da06319a97561564014c30f20adddb2854deab70a3c6773d159c9900035ad963b7de170daeb14f10549435e756dd74112d9ff4c560731ba714d51c1c2a2c2"

RPROVIDES:${PN} += "libtesseract.so.5 \
libtesseract5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libgomp.so.1 \
libleptonica.so.6 \
libm.so.6 \
libstdc++.so.6 \
tesseract-ocr-common"

inherit rpm
