SUMMARY = "Documentation for the Glade library"
DESCRIPTION = "This package contains documentation and examples for the Glade library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.4"

RPM_NAME = "libglade2-doc-2.6.4-30.11.noarch.rpm"
RPM_HASH = "b0867042977d8ba0a308651edd3d105009b081183fc73662b94ac1fb90301822287f65ef65864ccf260bdc6fab52304c713eb6a2371d16238827531af71d7aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libglade2-doc"

RDEPENDS:${PN} += "libglade-2-0-0"

inherit rpm
