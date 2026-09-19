SUMMARY = "Documentation for texlive-xeindex"
DESCRIPTION = "This package includes the documentation for texlive-xeindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-xeindex-doc-2026.226.0.0.3svn77682-59.4.noarch.rpm"
RPM_HASH = "a563a02d52f6eb73ab96d9ed60823a162b8652363b59e0cff8a38e86856f1bacddf68d25e1cc329946905566a5e7737b5f5ece8f927b019c64e808a04a5a8dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xeindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
