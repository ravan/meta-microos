SUMMARY = "Documentation for texlive-biblatex-trad"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-trad"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-biblatex-trad-doc-2026.226.0.0.5svn77682-61.2.noarch.rpm"
RPM_HASH = "2022a766fb26b15546c9474640cddd716814e379582f0acc40b7443461e91316cccfe3e211abe4e920c37425010c8653e4a200e3dd6336c1a6ad7c5aa8f2db4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-trad-doc"

RDEPENDS:${PN} += ""

inherit rpm
