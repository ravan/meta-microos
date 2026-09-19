SUMMARY = "Tesseract Open Source OCR Engine Development files"
DESCRIPTION = "This package contains development files for the Tesseract Open Source OCR \
Engine."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.5.3"

RPM_NAME = "tesseract-ocr-devel-5.5.3-1.1.aarch64.rpm"
RPM_HASH = "f7db865cb84ba6ef688ba68e0d1bacf643b8e585d97bf53c9322ed85d059395c7264078e124f11c765b12447ed748f224356c8cb5a78bac77512543ecad6087b"

RPROVIDES:${PN} += "pkgconfig-tesseract \
tesseract-ocr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtesseract5 \
pkgconfig-lept \
pkgconfig-libarchive"

inherit rpm
