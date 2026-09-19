SUMMARY = "Headers and manpages for iptables"
DESCRIPTION = "This library contains all the iptables code shared between iptables, \
ip6tables, their extensions, and for external integration for e.g. \
 \
Link your extension (iptables plugins) with $(pkg-config xtables \
--libs) and place the plugin in the directory given by $(pkg-config \
xtables --variable=xtlibdir)."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.13"

RPM_NAME = "libxtables-devel-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "de1e297ca290c3cd8a98f4efdafdb1658b5b95ddbb50f40176eb9e92495a1f5352acd16657a6d6dbb284c07247e35e4d89aa1cbebd9a6f23321758ccaa6217c7"

RPROVIDES:${PN} += "libxtables-devel \
pkgconfig-xtables"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtables12"

inherit rpm
