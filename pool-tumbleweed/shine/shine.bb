SUMMARY = "MP3 encoding tool"
DESCRIPTION = "Shine is an MP3 encoding library implemented in fixed-point \
arithmetic. This package contains the shineenc command line encoder."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "shine-3.1.1-2.5.aarch64.rpm"
RPM_HASH = "bf893d51c433c9ccad02848fe0f215c35a1d611a23f00b59d7c02cf431ec8ebf2355d605e38bde21842dfbb04ebd6178b26e9cafb7937dff0c83c30504ab2ead"

RPROVIDES:${PN} += "shine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libshine.so.3"

inherit rpm
