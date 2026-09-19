SUMMARY = "The Fast Lines Of Code Counter"
DESCRIPTION = "Count the lines of code, comments and blank lines in a source tree and \
print detailed statistics."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "flocc-0.1-1.11.aarch64.rpm"
RPM_HASH = "b0bd9661f162cc05735222c4eca77fbc26fd044414fba672af89e0a51cbf32e26b39df88c99267fd29111c905d165c537501b7351e0a24b270aac6c1b994041d"

RPROVIDES:${PN} += "flocc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgit2.so.1.9 \
libstdc++.so.6"

inherit rpm
