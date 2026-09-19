SUMMARY = "Ping and Traceroute Network Diagnostic Tool"
DESCRIPTION = "Mtr is a network diagnostic tool that combines Ping and Traceroute into \
one program. This package contains the mtr version with an ncurses \
interface, in other words, the text mode version is usable in a shell \
(telnet or SSH session, for example). \
 \
Find the graphical version in the mtr-gtk package."
LICENSE = "GPL-2.0-only"

PV = "0.96"

RPM_NAME = "mtr-0.96-1.6.aarch64.rpm"
RPM_HASH = "faf42c2dec6e6d477008ba89f73cf80734e057a570e1d1ca4e4c9b407e08a77e9856728ffe0e020ba9389a605e3a68a9e1bea4e6e0d4d9cc94a4f7dc6ae15e05"

RPROVIDES:${PN} += "mtr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libjansson.so.4 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
permissions"

inherit rpm
