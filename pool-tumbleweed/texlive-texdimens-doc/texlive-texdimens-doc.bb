SUMMARY = "Documentation for texlive-texdimens"
DESCRIPTION = "This package includes the documentation for texlive-texdimens"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn77682"

RPM_NAME = "texlive-texdimens-doc-2026.227.1.1svn77682-62.2.noarch.rpm"
RPM_HASH = "879cf2efc9719e26e8e1f54aacde72d1b60e1d5edcda05082b8bcd2faf44cf1cd69b61ed8ff128f5dfdda1012bdf0865e0f5b39ca57fbf209779f21affe2ac63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdimens-doc"

RDEPENDS:${PN} += ""

inherit rpm
