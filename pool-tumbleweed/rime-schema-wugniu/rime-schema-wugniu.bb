SUMMARY = "Wugniu input schema for rime"
DESCRIPTION = "wugniu input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-wugniu-20250315-1.4.noarch.rpm"
RPM_HASH = "280b2f552187bdbdfeccbc2ad68db6037c821fcef3717e1f1d104e0ca149dc566400df8af530c36fcd38a473baeae07fa8f904ac005cdb3a44f79bb1d7575c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-wugniu"

RDEPENDS:${PN} += ""

inherit rpm
