SUMMARY = "The basic X terminal program"
DESCRIPTION = " \
This package contains the basic X.Org terminal program desktop launcher."
LICENSE = "MIT"

PV = "410"

RPM_NAME = "xterm-410-1.3.aarch64.rpm"
RPM_HASH = "77a408d554dac04f843b5e251b126e2d9a4a90de7d20057a7505985dcf9b70fffa86915f29cd6a8f835f5afbb8ca8ef2e4d08fa8d39bf12b563f92227c4fdc98"

RPROVIDES:${PN} += "XFree86-/usr/X11R6/bin/xterm \
xorg-x11-/usr/X11R6/bin/xterm \
xterm"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
luit \
perl \
xterm-bin"

inherit rpm
