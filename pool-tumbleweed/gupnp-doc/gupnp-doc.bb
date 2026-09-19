SUMMARY = "Documentation for gupnp"
DESCRIPTION = "Documentation for GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.10"

RPM_NAME = "gupnp-doc-1.6.10-1.3.noarch.rpm"
RPM_HASH = "61e1f22fe431f651f69f124e90af2528ffe104c1eaef48f07fae90d3bcf412d9c36cbcf2d75e714a3b67d82c62dc10d04fd02c05a4b95ec553c0598b0018c6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gupnp-doc"

RDEPENDS:${PN} += ""

inherit rpm
