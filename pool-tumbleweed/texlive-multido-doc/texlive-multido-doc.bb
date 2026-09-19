SUMMARY = "Documentation for texlive-multido"
DESCRIPTION = "This package includes the documentation for texlive-multido"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.42svn77682"

RPM_NAME = "texlive-multido-doc-2026.226.1.42svn77682-61.2.noarch.rpm"
RPM_HASH = "76f65757237f09346497b69c8d029017c0f2221fccbba7aa9c2fbd7b7ae993f2bc1c89caae2905199e7a7b2c597d040ca77e37fa6f4dd0f46c47cbd52cded314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multido-doc"

RDEPENDS:${PN} += ""

inherit rpm
