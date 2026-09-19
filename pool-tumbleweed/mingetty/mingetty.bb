SUMMARY = "Minimal Getty for Virtual Consoles Only"
DESCRIPTION = "The mingetty program is a lightweight, minimalistic getty program for \
use on virtual consoles only. Mingetty is not suitable for serial lines \
(you should use the mgetty program for this purpose)."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.8s"

RPM_NAME = "mingetty-1.0.8s-25.9.aarch64.rpm"
RPM_HASH = "58c4e663e511778fa3a44220dac3c39157cd038b033c1cde0e087668c55d505c0dfc65028bf1d827e93e755fdcff7e8931c11e65290a71fe0158d3cb2d19c3f2"

RPROVIDES:${PN} += "mingetty \
sysvinit-/sbin/mingetty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
