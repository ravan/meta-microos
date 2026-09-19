SUMMARY = "A Data Serialization Format"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "capnproto-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "1a83a2f1f3f39cea9251b7563658bf5f17377969e5e6a224d42956983717261a43fdfd232a7014cdf32017eb831e0ef12f7196b229fd264c741c7567c8b98ab6"

RPROVIDES:${PN} += "capnproto"

RDEPENDS:${PN} += "libc.so.6 \
libcapnp-1-5-0 \
libcapnp-json.so.1.5.0 \
libcapnp.so.1.5.0 \
libcapnpc.so.1.5.0 \
libgcc-s.so.1 \
libkj.so.1.5.0 \
libstdc++.so.6"

inherit rpm
