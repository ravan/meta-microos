SUMMARY = "Documentation for texlive-langcode"
DESCRIPTION = "This package includes the documentation for texlive-langcode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76924"

RPM_NAME = "texlive-langcode-doc-2026.226.0.0.2svn76924-63.2.noarch.rpm"
RPM_HASH = "088f1a3250a23fb0966751037ec8753cefecb3d2e3b5c54ff41c2d8cac547f0823271165d81fab9da80910fa3bce4cd2cbc4228ea03b7b285a2e6d83994bc8f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
