SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "140.15.0"

RPM_NAME = "mozjs140-140.15.0-1.1.aarch64.rpm"
RPM_HASH = "0048e488862a0c287ea03e2c9d2f3dfa16241a7d092eb148eaa74f5a97d4be49952dc3d5f18a63e44d72bb5643fba77c7eedbc379052205b54dbd9db0653cfad"

RPROVIDES:${PN} += "mozjs140"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
