SUMMARY = "Documentation for texlive-seminar"
DESCRIPTION = "This package includes the documentation for texlive-seminar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.63asvn77682"

RPM_NAME = "texlive-seminar-doc-2026.226.1.63asvn77682-60.2.noarch.rpm"
RPM_HASH = "bc9bd05a9a053fcc3c7b7c36b627110f76bfa21d07eccde70e627837e0334f6738c22522af064126dd403f787544e5e5415e7c2f86ed43994ff007e795bd1f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seminar-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
