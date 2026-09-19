SUMMARY = "EXSLT Library"
DESCRIPTION = "This is the EXSLT C library developed for libxslt. \
EXSLT is a community initiative to provide extensions to XSLT."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.45"

RPM_NAME = "libexslt0-1.1.45-1.4.aarch64.rpm"
RPM_HASH = "4202c02b77514f1fd212c9c449a4bde7ab6483090d6970121c20b4443648af167accace815e2b17b9748f2e6965f35c332e21da7f3da8063b3407155b86ea14b"

RPROVIDES:${PN} += "libexslt.so.0 \
libexslt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
