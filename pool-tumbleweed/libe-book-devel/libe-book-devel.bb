SUMMARY = "A library to import non-HTML reflowable e-book formats"
DESCRIPTION = "libe-book is a library to import non-HTML reflowable e-book formats. \
Currently supported are PalmDoc, TealDoc, Plucker eBook, eReader eBook, \
FictionBook v.2, TCR, zTXT."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-devel-0.1.3-4.14.aarch64.rpm"
RPM_HASH = "32b584d849a7006631421c79a9ff98662493253038816d9f6f86da03de06f02ac87f0bfe818eb49603929f9f4ffdb74b52001593839ccd42eb4a0e30b3afaa76"

RPROVIDES:${PN} += "libe-book-devel \
pkgconfig-libe-book-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libe-book-0-1-1 \
libstdc++-devel \
pkgconfig-icu-uc \
pkgconfig-liblangtag \
pkgconfig-librevenge-0.0 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm
