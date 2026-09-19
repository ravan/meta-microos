SUMMARY = "Documentation for texlive-logicpuzzle"
DESCRIPTION = "This package includes the documentation for texlive-logicpuzzle"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn78101"

RPM_NAME = "texlive-logicpuzzle-doc-2026.226.2.5svn78101-61.2.noarch.rpm"
RPM_HASH = "0a964e1fee8cda4f30622a0fd65fc0f9eef2ef28d714d9b4772f1518b864bc9e9470cccd8a90e886bc0ab5a2f1405e0873224e459aa33680fcc1b21b667ce981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logicpuzzle-doc"

RDEPENDS:${PN} += ""

inherit rpm
