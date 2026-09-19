SUMMARY = "A security wrapper for TCP daemons"
DESCRIPTION = "This package contains a small daemon program that can monitor and \
filter incoming requests for finger, ftp, telnet, rlogin, rsh, exec, \
tftp, talk, and other network services."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "tcpd-7.6-901.6.aarch64.rpm"
RPM_HASH = "070386fc017609df616883e4ecbdbbd761c877a58809ed4e3d5984d114f39d7e3c77cc91676f0ca777e2cc829cc57b5d03adc712f05408854c3497f0de70cb7b"

RPROVIDES:${PN} += "nkitb-/usr/sbin/tcpd \
tcpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwrap.so.0"

inherit rpm
