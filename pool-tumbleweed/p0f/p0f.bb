SUMMARY = "A versatile passive OS fingerprinting tool"
DESCRIPTION = "P0f is a tool that utilizes an array of sophisticated, purely passive traffic \
fingerprinting mechanisms to identify the players behind any incidental TCP/IP \
communications (often as little as a single normal SYN) without interfering in \
any way."
LICENSE = "LGPL-2.1-only"

PV = "3.09b"

RPM_NAME = "p0f-3.09b-4.8.aarch64.rpm"
RPM_HASH = "553890232cf079d74b9872c7eb93ff9c5c6ca6b073a6844beeb1592122d87ac43ed15b8863dbfd927fdf1b0e441b85016a68a635f26ddce56f672f880a397f79"

RPROVIDES:${PN} += "config-p0f \
p0f"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1"

inherit rpm
