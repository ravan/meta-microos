SUMMARY = "Documentation for texlive-paralist"
DESCRIPTION = "This package includes the documentation for texlive-paralist"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-paralist-doc-2026.226.2.7svn77682-58.2.noarch.rpm"
RPM_HASH = "3741027446df00d95d0534b8c2eebd410eae1a58638b1aab52df476539b08f47af4818156b7591b6d92b703446a69613ccc77bd0f3e0e63cac01cb9bdaac6511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paralist-doc"

RDEPENDS:${PN} += ""

inherit rpm
