SUMMARY = "Documentation for texlive-animate"
DESCRIPTION = "This package includes the documentation for texlive-animate"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72548"

RPM_NAME = "texlive-animate-doc-2026.226.svn72548-61.2.noarch.rpm"
RPM_HASH = "d774d078c121a3f66d18ad8ccba30654eda689901c0b93556cb099dbca6a8eaf848c76a51c9f10c54e64f532d0e78d7c35e1404911cd910e86a84239c127493b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-animate-doc"

RDEPENDS:${PN} += ""

inherit rpm
