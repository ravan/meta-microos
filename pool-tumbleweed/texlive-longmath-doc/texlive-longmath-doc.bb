SUMMARY = "Documentation for texlive-longmath"
DESCRIPTION = "This package includes the documentation for texlive-longmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn71709"

RPM_NAME = "texlive-longmath-doc-2026.226.1.0svn71709-61.2.noarch.rpm"
RPM_HASH = "df9817adf0136768c5d61f5d1243aaaff4e5f6a1d7b55060b387b03a98814499973bfc51a6c7c0dbe7ac7d4cc5134b41bf5353a4a29bec653bef1631c4c7adc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
