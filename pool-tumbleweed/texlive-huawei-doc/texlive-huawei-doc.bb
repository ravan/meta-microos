SUMMARY = "Documentation for texlive-huawei"
DESCRIPTION = "This package includes the documentation for texlive-huawei"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19.1svn73148"

RPM_NAME = "texlive-huawei-doc-2026.226.0.0.19.1svn73148-60.2.noarch.rpm"
RPM_HASH = "e6c0b6066d8ed8ba52d60c0733fb86117f55a471f9905659a74dbb07327b8598a90722914b7306be7c2aa642a258320a213831692235a8dd32c738bfda977148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-huawei-doc"

RDEPENDS:${PN} += ""

inherit rpm
