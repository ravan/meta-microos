SUMMARY = "Documentation for texlive-ran_toks"
DESCRIPTION = "This package includes the documentation for texlive-ran_toks"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59515"

RPM_NAME = "texlive-ran_toks-doc-2026.226.svn59515-60.4.noarch.rpm"
RPM_HASH = "ad85823e4fd2ac1238e015b8cfb8bab0800ab50e007ce5f04def1db6a91760c7693528064d36bb3a54cdbf87d5bb3439a0f15e124978bd678df7fee2a0d263e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ran-toks-doc"

RDEPENDS:${PN} += ""

inherit rpm
