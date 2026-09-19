SUMMARY = "Documentation for texlive-decorule"
DESCRIPTION = "This package includes the documentation for texlive-decorule"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-decorule-doc-2026.226.0.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "0fd7d4a2e0da3e483cec48561d4feb993f689c57a782400f17fd7efb3a44148f42a8489a6fe6a62eed1c424a5813cf5d0bafd103c7d348dfba938b9484f89aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decorule-doc"

RDEPENDS:${PN} += ""

inherit rpm
