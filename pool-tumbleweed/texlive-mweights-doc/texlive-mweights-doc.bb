SUMMARY = "Documentation for texlive-mweights"
DESCRIPTION = "This package includes the documentation for texlive-mweights"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-mweights-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "305720e48dda9b113a8fd87ca81e42c198e62a1b8bde08890cfc353f8b2fb4924503ca9816579b993e0fe1cd57ca09b57f15a7d2df2693b682902b7866d40d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mweights-doc"

RDEPENDS:${PN} += ""

inherit rpm
