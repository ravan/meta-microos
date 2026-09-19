SUMMARY = "Documentation for texlive-linguex"
DESCRIPTION = "This package includes the documentation for texlive-linguex"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.3svn77682"

RPM_NAME = "texlive-linguex-doc-2026.226.4.3svn77682-61.2.noarch.rpm"
RPM_HASH = "8e78578a46faa570d054fbbf23858a3c270e091ca90431f4650fd004dc91f7393c903a4d415457b6b00bc62a01024bab0661183411bc4dbb1d1d8a0c1d8fb2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linguex-doc"

RDEPENDS:${PN} += ""

inherit rpm
