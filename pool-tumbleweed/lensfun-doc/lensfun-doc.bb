SUMMARY = "Documentation for lensfun"
DESCRIPTION = "Documentation and manual files for the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "lensfun-doc-0.3.4-7.5.noarch.rpm"
RPM_HASH = "f4fe4705487bad5ccf9ed9c6ee85a2ff5f2fd4988517c8c6ffd097bbb2ad12eeb0ae5ea5fd7f09b28b113fe4099554d62fbfb3e5e7c0dc8fdf53186cd6419337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lensfun-doc"

RDEPENDS:${PN} += "lensfun-data"

inherit rpm
