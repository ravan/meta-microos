SUMMARY = "Development documentation for Engauge Digitizer"
DESCRIPTION = "This package contains the development documentation for Engauge Digitizer."
LICENSE = "GPL-2.0-or-later"

PV = "12.9.1"

RPM_NAME = "engauge-digitizer-devel-doc-12.9.1-2.2.noarch.rpm"
RPM_HASH = "d4d7e9ede8ebdac63f3fdbae518ca0f74eaf221ee78f6df6e929efecd84ed801dc2db6b7b1dad87009c18176a9752e554cb04605b090cf40a8b91bc7264594ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engauge-digitizer-devel-doc"

RDEPENDS:${PN} += "engauge-digitizer"

inherit rpm
