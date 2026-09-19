SUMMARY = "Documentation for texlive-fontsize"
DESCRIPTION = "This package includes the documentation for texlive-fontsize"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn78101"

RPM_NAME = "texlive-fontsize-doc-2026.226.0.0.9svn78101-60.2.noarch.rpm"
RPM_HASH = "437aa117229448013186187c287129a7aee84fff8c9ee4b0b43d96f48a45fd64138888111fc8f7d35cd95c625199dc1ca3ec733bdd938924de3c3270c32fe28c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
