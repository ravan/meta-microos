SUMMARY = "Documentation for texlive-ppr-prv"
DESCRIPTION = "This package includes the documentation for texlive-ppr-prv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13csvn15878"

RPM_NAME = "texlive-ppr-prv-doc-2026.226.0.0.13csvn15878-59.2.noarch.rpm"
RPM_HASH = "80506aacc6cfd73b33834d0fb190202336ef00a3f18588619bc1745779272457fafd6417234d30c656340f31f6b0b02daf87c5006993ce54e8f5ac948b4d27ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ppr-prv-doc"

RDEPENDS:${PN} += ""

inherit rpm
