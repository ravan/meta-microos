SUMMARY = "Open Source OCR Engine"
DESCRIPTION = "A commercial quality OCR engine originally developed at HP between 1985 and \
1995. In 1995, this engine was among the top 3 evaluated by UNLV. It was \
open-sourced by HP and UNLV in 2005. From 2007 it is developed by Google."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.5.3"

RPM_NAME = "tesseract-ocr-5.5.3-1.1.aarch64.rpm"
RPM_HASH = "d7ef721e7a8521e18fd8bde9c3182007706014274497278479fb8ead2ff5cc0fcec0589dc0106737d04eedaa9073e84d3b53020bf3b67056a36d8b20ff3f09c8"

RPROVIDES:${PN} += "tesseract-ocr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libleptonica.so.6 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libtesseract.so.5 \
tesseract-ocr-common"

inherit rpm
