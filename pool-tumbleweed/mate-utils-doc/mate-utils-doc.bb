SUMMARY = "Documentation how to mate-utils"
DESCRIPTION = "This package contains the documentation for mate-utils"
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-utils-doc-1.28.0-2.6.noarch.rpm"
RPM_HASH = "a03a4879bb994d0ad23d23de5039cc51b99c4ccf67d87389fe72a2bad99534a8bfa9b9c82662ef6fe8b4bccb16fd50aa97fe413b28d55ece84ba67ba62e9bad9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-utils-doc"

RDEPENDS:${PN} += ""

inherit rpm
