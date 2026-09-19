SUMMARY = "Logic Analyzer Command Line Tool"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
sigrok-cli is a command-line tool written in C, which uses both \
libsigrok and libsigrokdecode to provide the basic sigrok \
functionality from the command-line. Among other things, it's useful \
for scripting purposes."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.2"

RPM_NAME = "sigrok-cli-0.7.2-1.20.aarch64.rpm"
RPM_HASH = "8c12dfd394c4141a0a44e34b85f002761475d26a11a55aa326bd03c867e3fae3cc2cd77b37a7b29e647566ad5349661e0b793bf6931a68a9e3768e99b8407bbc"

RPROVIDES:${PN} += "sigrok-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsigrok.so.4 \
libsigrokdecode.so.4"

inherit rpm
