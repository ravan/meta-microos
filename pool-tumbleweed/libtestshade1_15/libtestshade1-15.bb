SUMMARY = "Osl library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "libtestshade1_15-1.15.4.0-3.1.aarch64.rpm"
RPM_HASH = "ba00f59db2e1cb7860cd664e86a0336513315abde7a3fbb4dcb97420b94a38694ea2806fa2366e8cf58cf6d1b1134abf0e7b6b1f747abbb013ba67041ee40f89"

RPROVIDES:${PN} += "libtestshade.so.1.15 \
libtestshade1-15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenImageIO-Util.so.3.1 \
libOpenImageIO.so.3.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liboslcomp.so.1.15 \
liboslexec.so.1.15 \
liboslquery.so.1.15 \
libstdc++.so.6"

inherit rpm
