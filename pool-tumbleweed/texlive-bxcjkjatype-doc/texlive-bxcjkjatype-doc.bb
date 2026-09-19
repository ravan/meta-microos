SUMMARY = "Documentation for texlive-bxcjkjatype"
DESCRIPTION = "This package includes the documentation for texlive-bxcjkjatype"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn67705"

RPM_NAME = "texlive-bxcjkjatype-doc-2026.226.0.0.5svn67705-59.2.noarch.rpm"
RPM_HASH = "4994ed362d5ef68e7de553670a5a3eb56b9491d304920466ac54446bacd13bab7c09541ba48572eda23f654132c17cb6d82e46be496a5d48de639ff4cc3dee93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxcjkjatype-doc-ja;en \
texlive-bxcjkjatype-doc"

RDEPENDS:${PN} += ""

inherit rpm
