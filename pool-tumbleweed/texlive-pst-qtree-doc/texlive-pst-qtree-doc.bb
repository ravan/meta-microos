SUMMARY = "Documentation for texlive-pst-qtree"
DESCRIPTION = "This package includes the documentation for texlive-pst-qtree"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-pst-qtree-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "9b68e7ad8aac76fd9cd0e65f7a084451e50fa55f4fc2f8f3855a73a62d5578a57182d116ee4a3e783213cc6d628f6b32c1db9fe27239926acb6e820430b323d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
