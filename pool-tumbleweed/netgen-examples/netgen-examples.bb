SUMMARY = "NETGEN examples"
DESCRIPTION = "Various example geometry data for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2602"

RPM_NAME = "netgen-examples-6.2.2602-3.5.noarch.rpm"
RPM_HASH = "ca136b4d6e5e6a24238de25b0d024018646a504af430237140480de5dc7912e4ec6373f820ccec2d486e9e12a403288a555673a4243b73d3f6b4b0d27763b8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netgen-/usr/share/netgen/cube.geo \
netgen-examples"

RDEPENDS:${PN} += "netgen"

inherit rpm
