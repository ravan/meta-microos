SUMMARY = "Microsoft Publisher file format parser library"
DESCRIPTION = "libmspub is a library for parsing the Corel Draw file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux."
LICENSE = "MPL-2.0"

PV = "0.1.5"

RPM_NAME = "libmspub-0_1-1-0.1.5-2.3.aarch64.rpm"
RPM_HASH = "6649fababa076b2a431efbd4abb6d1af5892f6f70b39fc00297c0aae7e12abbff7c00e1c29386d75254cf4ebfd0e363452438934b8a3b4ba5037f6cbfb4ab24b"

RPROVIDES:${PN} += "libmspub-0-1-1 \
libmspub-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
