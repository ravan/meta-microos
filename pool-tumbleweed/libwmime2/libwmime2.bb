SUMMARY = "Library for working with MIME messages and IMAP/POP/SMTP"
DESCRIPTION = "VMime is a C++ class library for working with RFC5322 and \
MIME-conforming messages (RFC2045–2049), as well as Internet \
messaging services like IMAP, POP or SMTP. \
 \
VMime can parse, generate and modify messages, and also connect to \
store and transport services to receive or send messages over the \
Internet. The library offers features to build a mail client."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "libwmime2-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "2e4977f44d8b12eb317164d5449558ea184ade9cbe3df52c0dc00cc65793f48140bf8419dc05f0630bdab549bfce228dae87e9bc1e84ce371b2e7d6b5843a1fe"

RPROVIDES:${PN} += "libwmime.so.2 \
libwmime2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libgsasl.so.18 \
libstdc++.so.6"

inherit rpm
