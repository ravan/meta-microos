SUMMARY = "Console based Tetris clone"
DESCRIPTION = "A colorized, small and flexible Tetris clone for the console."
LICENSE = "GPL-2.0-or-later"

PV = "0.43"

RPM_NAME = "ctris-0.43-2.5.aarch64.rpm"
RPM_HASH = "0df1f9ce28d5ca1ece29e451cd9f5c2194ce7b5dc1d17ae9083c6e1c52ee59bd2bda6b72e244e0812e745311f3bf300fd27d11de97af09c98c749560b2c9d698"

RPROVIDES:${PN} += "ctris"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
