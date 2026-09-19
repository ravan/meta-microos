SUMMARY = "Documentation for texlive-exercise"
DESCRIPTION = "This package includes the documentation for texlive-exercise"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn76924"

RPM_NAME = "texlive-exercise-doc-2026.226.1.6svn76924-59.2.noarch.rpm"
RPM_HASH = "3401ecf4e187d2ac6ff32c96c351ec029f47ba39aad71d51aec0c03dfa243c12668a9327d43a923ffca5c0a27fb802cd1e45c826ee1173f1309261659ac6fdb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercise-doc"

RDEPENDS:${PN} += ""

inherit rpm
