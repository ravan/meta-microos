SUMMARY = "Injected bundles for wpewebkit"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "2.52.6"

RPM_NAME = "wpewebkit-2_0-injected-bundles-2.52.6-1.1.aarch64.rpm"
RPM_HASH = "dfb9b5b7702618a2838b89e532d6ea64758fc5d384a40807d09cb1e235aa6ee58fc430f37f7e22ac28293a88f9662def6ea23d87b08908f94acdcc076747c842"

RPROVIDES:${PN} += "libWPEInjectedBundle.so \
wpewebkit-2-0-injected-bundles"

RDEPENDS:${PN} += "libWPEWebKit-2.0.so.1 \
libc.so.6"

inherit rpm
