SUMMARY = "Documentation for texlive-luanumint"
DESCRIPTION = "This package includes the documentation for texlive-luanumint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn68918"

RPM_NAME = "texlive-luanumint-doc-2026.226.1.2svn68918-59.2.noarch.rpm"
RPM_HASH = "2f5f1f4c2385739318bb3cbcbd5f50961a9b7d7449ff8c7e24365c78186862c48fa79225bfd122c91a30b13444fc4fd91c58d5cae57bd6830761dfa91c9013b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luanumint-doc"

RDEPENDS:${PN} += ""

inherit rpm
