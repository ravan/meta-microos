SUMMARY = "Documentation for texlive-trfsigns"
DESCRIPTION = "This package includes the documentation for texlive-trfsigns"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.01svn15878"

RPM_NAME = "texlive-trfsigns-doc-2026.226.1.01svn15878-59.2.noarch.rpm"
RPM_HASH = "e2b423ab4aa9aec08022eff66acf9656354d9f2287e38c8cf2cf042705b5937ea2ba8fab7b427f72d704a490e2ebeef82d25017c0ac5a1b06634578d36331fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-trfsigns-doc-de \
texlive-trfsigns-doc"

RDEPENDS:${PN} += ""

inherit rpm
