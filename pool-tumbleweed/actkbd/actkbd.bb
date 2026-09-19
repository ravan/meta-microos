SUMMARY = "A keyboard shortcut daemon"
DESCRIPTION = "actkbd is a daemon that reacts to user defined keys and launches specific \
commands. It can be used to utilize multimedia keys on simple setups, or \
assigned custom actions to rarely used keys."
LICENSE = "GPL-2.0-only"

PV = "0.2.8"

RPM_NAME = "actkbd-0.2.8-6.13.aarch64.rpm"
RPM_HASH = "05d1ec6fb9e8489ecf3b9f9871ba55cccf12d07a1e3bce542d9043c1ce597375ae93f307a9131033b30b6b1b3a61716b5bdaf4135acc067b8d4bf4e9b92da0fa"

RPROVIDES:${PN} += "actkbd \
config-actkbd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
