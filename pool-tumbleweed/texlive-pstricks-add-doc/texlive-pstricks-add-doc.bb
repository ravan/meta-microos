SUMMARY = "Documentation for texlive-pstricks-add"
DESCRIPTION = "This package includes the documentation for texlive-pstricks-add"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.94svn77682"

RPM_NAME = "texlive-pstricks-add-doc-2026.226.3.94svn77682-60.4.noarch.rpm"
RPM_HASH = "2755c718236540ca139577ade72c0485b9330db7add1ac8f1e1d8a9b750f2a0fef5706852a11ce31c04b82d46f8191d0eab54884ebf65d2c10a0d7a48754aef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-add-doc"

RDEPENDS:${PN} += ""

inherit rpm
