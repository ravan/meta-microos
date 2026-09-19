SUMMARY = "A terminal email client"
DESCRIPTION = "Matcha is a terminal email client for users who prefer keyboards \
over mice and terminals over browsers. \
 \
It is built with Go and the Bubble Tea TUI framework. It supports \
email providers such as Gmail and iCloud. Mail can be read, composed \
and managed entirely from the command line."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "matcha-0.16.0-1.7.aarch64.rpm"
RPM_HASH = "408e43d81adeaa4a214b7a9599588b00c214f108ff644914a30cccf64a37e2f3edb07cb0628800ee05034978dee17db35d2ea9478e59ca985f31e16b45b57fbd"

RPROVIDES:${PN} += "matcha"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
