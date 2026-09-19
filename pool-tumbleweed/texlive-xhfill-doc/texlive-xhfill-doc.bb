SUMMARY = "Documentation for texlive-xhfill"
DESCRIPTION = "This package includes the documentation for texlive-xhfill"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-xhfill-doc-2026.226.1.01svn77682-59.4.noarch.rpm"
RPM_HASH = "d5c99198ed2a964e17ed8bdc73bc7ecb9f42a110b858c4b7f48be90edbeb50effd5d40d0037ffec891abcb48a9123f7ef77058edf8054c1ddfc8bdeb3e4e5b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xhfill-doc"

RDEPENDS:${PN} += ""

inherit rpm
