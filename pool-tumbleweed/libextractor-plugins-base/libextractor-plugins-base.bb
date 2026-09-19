SUMMARY = "Base pugins for libextractor"
DESCRIPTION = "GNU Libextractor is a library for extracting meta data from various files types. \
 \
This package contains file format plugins for libextractor that do not add extra \
dependencies."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-base-1.14-1.2.aarch64.rpm"
RPM_HASH = "2d46a0edce0aaa8edd81029ec39c4bb81b74a2f875b0d0ebbbf877dc4887e99405a3ed5a18d4bed226dd9af3ec74722f301cf18f35df7f3236705aa7d2c24330"

RPROVIDES:${PN} += "libextractor-applefile.so \
libextractor-deb.so \
libextractor-dvi.so \
libextractor-elf.so \
libextractor-it.so \
libextractor-man.so \
libextractor-nsf.so \
libextractor-nsfe.so \
libextractor-odf.so \
libextractor-plugins-base \
libextractor-png.so \
libextractor-ps.so \
libextractor-qt.so \
libextractor-real.so \
libextractor-riff.so \
libextractor-s3m.so \
libextractor-sid.so \
libextractor-wav.so \
libextractor-xm.so \
libextractor-zip.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libextractor-common.so.1 \
libz.so.1"

inherit rpm
