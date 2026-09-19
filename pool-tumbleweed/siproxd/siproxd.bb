SUMMARY = "A SIP masquerading proxy with RTP support"
DESCRIPTION = "Siproxd is an proxy/masquerading daemon for the SIP protocol. It handles \
registrations of SIP clients on a private IP network and performs \
rewriting of the SIP message bodies to make SIP connections possible \
via an masquerading firewall. It allows SIP clients (like kphone, \
linphone) to work behind an IP masquerading firewall or router."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "siproxd-0.8.3-7.8.aarch64.rpm"
RPM_HASH = "770e514432b4c0135aa4cc670031d2b8965c22aea3a702afc113a3e420de8ff2d6dd4be0376e8e3fe68a5f95331cf07269256d8044cdf0a0ff80926875780d4d"

RPROVIDES:${PN} += "config-siproxd \
group-siproxd \
siproxd \
user-siproxd"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libosipparser2.so.15 \
libsqlite3.so.0 \
logrotate"

inherit rpm
