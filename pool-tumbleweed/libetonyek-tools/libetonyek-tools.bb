SUMMARY = "Tools to work with Apple Keynote presentations"
DESCRIPTION = "This package contains tools to work with Apple Keynote presentations"
LICENSE = "MPL-2.0"

PV = "0.1.13"

RPM_NAME = "libetonyek-tools-0.1.13-2.3.aarch64.rpm"
RPM_HASH = "ff512b0b0bd59fa096c13458ee3edb57b1a76487ee7fc8e7aa6bda0de2791eeb427883e77a1434534c5e3f5c83d182cb0e1f4e971138235a45f14930beb62a38"

RPROVIDES:${PN} += "libetonyek-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libetonyek-0.1.so.1 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
