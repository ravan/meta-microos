SUMMARY = "An interpreter for Magnetic Scrolls games"
DESCRIPTION = "An interpreter for games produced by the studio Magnetic Scrolls. It \
can be used to play 'The Pawn', 'The Guild of Thieves', 'Jinxter', \
'Fish!', 'Myth', 'Corruption' and 'Wonderland'."
LICENSE = "BSD-2-Clause"

PV = "0.37"

RPM_NAME = "dMagnetic-0.37-1.9.aarch64.rpm"
RPM_HASH = "f3f8021e5b3be64f17c7e23296f5d60937fed5a471096cf04b6ca586d3ce88edec868a41b2ee1d0148b4a6ce36f4d211d9221b55aaa3e2a7d8fd30b4a5892970"

RPROVIDES:${PN} += "dMagnetic"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
