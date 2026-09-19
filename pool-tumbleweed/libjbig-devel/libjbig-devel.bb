SUMMARY = "JBIG1 lossless image compression library -- development files"
DESCRIPTION = "The libjbig-devel package contains files needed for development using \
the JBIG-KIT image compression library."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "libjbig-devel-2.1-5.11.aarch64.rpm"
RPM_HASH = "f4bcb995ba578cdc4ce5a71ebafd6b5a51acf7e8cb6db274007a62250dffa74f6cca7c8d9a099eae339b613616c8eca7d22ed51729ca9b561487de8698dbabf5"

RPROVIDES:${PN} += "libjbig-devel"

RDEPENDS:${PN} += "libjbig2"

inherit rpm
