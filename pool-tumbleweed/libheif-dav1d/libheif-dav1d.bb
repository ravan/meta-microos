SUMMARY = "Plugin dav1d decoder for AVIF"
DESCRIPTION = "This plugin provides the dav1d encoder for AVIF to libheif. Packaged separately \
so that the libraries it requires are not pulled in by default by libheif."
LICENSE = "LGPL-3.0-only & MIT"

PV = "1.23.4"

RPM_NAME = "libheif-dav1d-1.23.4-1.1.aarch64.rpm"
RPM_HASH = "c54d920b546867716f15b58b22f5f3573ad4cb80b1e4beec6705ae00b9a8eb6524594b6340aae198d8cdbedb8c71308271d2f3b2ac0fd7f60206d39037c1a763"

RPROVIDES:${PN} += "libheif-dav1d \
libheif-dav1d.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdav1d.so.7 \
libgcc-s.so.1 \
libheif.so.1 \
libheif1 \
libstdc++.so.6"

inherit rpm
