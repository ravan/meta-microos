SUMMARY = "Shared library implementing C++ classes that are frequently used"
DESCRIPTION = "Bobcat is an acronym of `Brokken's Own Base Classes And Templates'. It is a \
shared library implementing C++ classes that are frequently used in software \
developed by Frank Brokken. All of Frank's C++ programs hosted at GitLab \
depend on `bobcat'."
LICENSE = "GPL-3.0-only"

PV = "6.15.01"

RPM_NAME = "libbobcat6-6.15.01-1.1.aarch64.rpm"
RPM_HASH = "885f06a22840a45b53c7f340d3ed3bee671feff0837a0b014dade9b418fbfd9884780f3087d1afd112ed22e4b777f38a47ef488f59d20e93ded4053a2ea6ef34"

RPROVIDES:${PN} += "libbobcat \
libbobcat.so.6 \
libbobcat6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
