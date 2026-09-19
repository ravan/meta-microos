SUMMARY = "Hayes-style AT-command modem emulator bridging serial-style I/O to TCP/Telnet"
DESCRIPTION = "modemu2k is a Hayes-style AT-command modem emulator bridging a \
serial-style interface to TCP/Telnet ('dials' out and answers incoming \
connections). It ships as a C library (libmodemu2k) exposing the modem \
state machine, plus a small CLI built on top that allocates a PTY and \
either reads stdin/stdout directly, forks a comm program (minicom, \
picocom) on the slave, or accepts an incoming TCP connection as the \
TTY. IPv4 and IPv6. \
 \
modemu2k is based on modemu, originally developed by Toru Egashira. \
 \
This package contains the CLI binary and the m2k-minicom / m2k-picocom \
helper scripts."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "modemu2k-0.2.4-1.2.aarch64.rpm"
RPM_HASH = "cab7b4e5308bba98304d9b31a77dfbdca4e21e3127b4a664b232bf490268962aabb6307102701d9e42114b73d766ae8fbfd3a639d94e00b29f31899767541d4b"

RPROVIDES:${PN} += "modemu2k"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmodemu2k.so.0"

inherit rpm
