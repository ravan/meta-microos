SUMMARY = "Development files for vmime, an e-mail message library"
DESCRIPTION = "VMime is a C++ class library for working with RFC5322 and \
MIME-conforming messages (RFC2045–2049), as well as Internet \
messaging services like IMAP, POP or SMTP. \
 \
This subpackage contains the headers for the library's API."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "wmime-devel-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "b798da33fae8bd74d9632869e97a62fd8d6b747d09ece8ae0f3652363e4a1fca86a55624621f3c8bc173a5d2ac3325bf71b2c37310745266d93df8d48534e1a5"

RPROVIDES:${PN} += "cmake-wmime \
libvmime-devel \
pkgconfig-vmime \
pkgconfig-wmime \
wmime-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwmime2 \
pkgconfig-gnutls \
pkgconfig-libgsasl \
pkgconfig-vmime"

inherit rpm
