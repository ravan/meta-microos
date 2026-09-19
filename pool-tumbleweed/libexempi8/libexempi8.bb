SUMMARY = "XMP support library"
DESCRIPTION = "Exempi is a library for XMP parsing and I/O. XMP (Extensible Metadata \
Platform) facilitates embedding metadata in files using a subset of \
RDF. Most notably, XMP supports embedding metadata in PDF and many \
image formats."
LICENSE = "BSD-3-Clause"

PV = "2.6.6"

RPM_NAME = "libexempi8-2.6.6-1.5.aarch64.rpm"
RPM_HASH = "e401041836c2e01a0faf043f72720571cdcf0b9ec94dbe9cdff4a9fc025a17197993187a944f9f56c61d5d6c8b7ef308992e1353c36a436aa477884cd1f51cfb"

RPROVIDES:${PN} += "libexempi.so.8 \
libexempi8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
