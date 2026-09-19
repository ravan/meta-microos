SUMMARY = "Documentation for texlive-pecha"
DESCRIPTION = "This package includes the documentation for texlive-pecha"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-pecha-doc-2026.226.0.0.1svn15878-58.2.noarch.rpm"
RPM_HASH = "5c4e22372409c22c7cccc9ed454d0155092c1e48ea92d4cecd230be7f0db0c95a57defa4b3deeeeb6541d1ad4fc3f6a1b69bdf20316f4fc661c6207d60ae9c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pecha-doc"

RDEPENDS:${PN} += ""

inherit rpm
