SUMMARY = "Network Time Protocol daemon (version 4)"
DESCRIPTION = "The Network Time Protocol (NTP) is used to synchronize the time of a \
computer client or server to another server or reference time source, \
such as a radio, satellite receiver, or modem. \
 \
Ntpd is an operating system daemon that sets and maintains the system \
time-of-day synchronized with Internet standard time servers."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p18"

RPM_NAME = "ntp-4.2.8p18-3.3.aarch64.rpm"
RPM_HASH = "948c80ca124b965ba5cc936888650bfb34abd974095797460506b1b72673b6cde0828e5d96f558f9cb50d3feb43b9a23ad04766d6dc14542528f5be2a723d1b9"

RPROVIDES:${PN} += "config-ntp \
ntp \
ntp-daemon \
perl-NTP--Util \
xntp \
xntp3"

RDEPENDS:${PN} += "/usr/bin/base64 \
/usr/bin/bash \
/usr/bin/gawk \
/usr/bin/logger \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-ntp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-sd.so.1 \
libevent-core-2.1.so.7 \
libm.so.6 \
libreadline.so.8 \
timezone \
user-ntp"

inherit rpm
