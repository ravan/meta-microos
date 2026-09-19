SUMMARY = "Development files for libetpan, a mail handling library"
DESCRIPTION = "libEtPan is a mail purpose library. It will be used for low-level mail \
handling: network protocols (IMAP/NNTP/POP3/SMTP over TCP/IP and \
SSL/TCP/IP, already implemented), local storage (mbox/MH/maildir) \
and message / MIME parsing."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "libetpan-devel-1.10.1-1.3.aarch64.rpm"
RPM_HASH = "edb77fed7ae741c3e4ef13afb249d0825d2a94fdf8537f5e14b1f3c30ce1e0af47db1da0d3e55cc0bc26250c4345d75a2fc9ec754dd271a489917ec47c4f87d5"

RPROVIDES:${PN} += "libetpan-devel \
pkgconfig-libetpan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
db-devel \
libetpan26 \
pkgconfig-gnutls \
pkgconfig-gpg-error \
pkgconfig-libgcrypt \
pkgconfig-libsasl2 \
pkgconfig-zlib"

inherit rpm
