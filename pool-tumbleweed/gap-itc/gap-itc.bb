SUMMARY = "GAP: Interactive Todd-Coxeter"
DESCRIPTION = "This GAP package provides access to interactive Todd-Coxeter \
computations with finitely presented groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "gap-itc-1.5.1-2.5.noarch.rpm"
RPM_HASH = "1bae727dfc87da6a37908ee1ab7d0e74f131f2c6e4d9f48395cfb0c01ca6349f027442b8dd794e20ebd0e3096c2467c882441559363a32f47dc3cc0bd6733aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-itc"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-xgap"

inherit rpm
