SUMMARY = "Stroke input schema for rime"
DESCRIPTION = "stroke input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-stroke-20250315-1.4.noarch.rpm"
RPM_HASH = "b877019025bead2f8bd28abff2b7eb415a130e87a01cd034dadf81a98ab80f22f756e8a7cd862b09ad1dd55b7f0036edf384fe321e576647807591c12a49b825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-stroke"

RDEPENDS:${PN} += ""

inherit rpm
