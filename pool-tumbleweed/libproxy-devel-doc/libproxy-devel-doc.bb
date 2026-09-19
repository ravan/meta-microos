SUMMARY = "Libproxy developers documentation"
DESCRIPTION = "The developers documentation to libproxy (consumer library)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.5.12"

RPM_NAME = "libproxy-devel-doc-0.5.12-2.4.noarch.rpm"
RPM_HASH = "e173950c98b4b786da6da1286a8075d9a1589e2cede62ece9b6e21d89e7b503bd19690abffdd537278fafb8242f377e33b34e43a2dd5778fd4850c94e072a5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libproxy-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
