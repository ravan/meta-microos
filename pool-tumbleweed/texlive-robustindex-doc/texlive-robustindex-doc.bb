SUMMARY = "Documentation for texlive-robustindex"
DESCRIPTION = "This package includes the documentation for texlive-robustindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49877"

RPM_NAME = "texlive-robustindex-doc-2026.226.svn49877-60.2.noarch.rpm"
RPM_HASH = "becf5e0a0bf92db6c962bb1b310a720f5dfccb51c4890f09068e97590c51c09247e8df0fa0d73a1bf8c16c0e55f27160e7010925964ab4d89842cc6f64e44761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robustindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
