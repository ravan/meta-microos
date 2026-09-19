SUMMARY = "Samples for xom"
DESCRIPTION = "This package provides Samples for xom."
LICENSE = "LGPL-2.0-only"

PV = "1.3.9"

RPM_NAME = "xom-demo-1.3.9-3.7.noarch.rpm"
RPM_HASH = "e4058e3b11453674f1fe000d5265cb03981aa96a84d4e1716a171e072f13741ba543901b65351d1bed4dcc66f68925c12fa625dfede01f770df5f40bc0107833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xom-demo"

RDEPENDS:${PN} += "xom"

inherit rpm
