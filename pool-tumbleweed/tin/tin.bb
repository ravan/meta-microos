SUMMARY = "Threaded NNTP and spool-based UseNet news reader"
DESCRIPTION = "tin is a full-screen Usenet news reader for the console. It can read \
news locally (/var/spool/news) or remotely via an NNTP server. It \
supports threading, scoring, different charsets and support for \
different languages. It automatically utilizes NOV newsoverview(5) \
style index files if available locally or via the NNTP [X]OVER \
command. \
 \
This version contains two patches by dnh@opensuse.org changing the \
default key for toggling rot13 from '%' to 'd' and displaying the \
number of unread posts instead of lines in the threadlist. If you, as \
a user, disagree with these patches, do contact dnh."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "tin-2.6.4-1.7.aarch64.rpm"
RPM_HASH = "29a552c0680c846fef72196cca7275f55086fb487f9432568d5784665e4226964fa1ffb35d0e9de0c19d657d96692cf0e8220071add6c5026beb29f19c52c5b9"

RPROVIDES:${PN} += "config-tin \
tin"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgsasl.so.18 \
libidn.so.12 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
