SUMMARY = "Osl library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.15.4.0"

RPM_NAME = "liboslquery1_15-1.15.4.0-3.1.aarch64.rpm"
RPM_HASH = "0d7763f1f80c77ff99dc3036c2a9f41677e0c6d0d37d2b534c94e2e2e0b0381e2fb018412b046addb4d0c568cf36602b27d964365a1ea71439cdde20249cf5da"

RPROVIDES:${PN} += "liboslquery.so.1.15 \
liboslquery1-15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenImageIO-Util.so.3.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
