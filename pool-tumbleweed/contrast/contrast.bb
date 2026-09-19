SUMMARY = "Check difference between two colors"
DESCRIPTION = "Check whether the contrast between two colors meet the WCAG requirements."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.11+53"

RPM_NAME = "contrast-0.0.11+53-1.3.aarch64.rpm"
RPM_HASH = "3b8367881f11ed350095a97eae0000148085236e75a582ed2a7033f221b9b0ca3f7bdc38775aab1e6a1b53b6f1e2e96b2765aadfc0a4c48a83cc011743e2d658"

RPROVIDES:${PN} += "contrast"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
