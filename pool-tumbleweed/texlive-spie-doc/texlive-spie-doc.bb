SUMMARY = "Documentation for texlive-spie"
DESCRIPTION = "This package includes the documentation for texlive-spie"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.25svn75447"

RPM_NAME = "texlive-spie-doc-2026.226.3.25svn75447-64.2.noarch.rpm"
RPM_HASH = "a0d8d2a692d4e47d25aa4be42f0eb53b41ec9ab4b174dea5fd055b7a9b95ba9aa6fa35930d4b417f0a59c86b86409f9a94ba916eb38cc0018c681d33bd541bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spie-doc"

RDEPENDS:${PN} += ""

inherit rpm
