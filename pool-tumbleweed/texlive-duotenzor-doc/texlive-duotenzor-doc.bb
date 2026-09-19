SUMMARY = "Documentation for texlive-duotenzor"
DESCRIPTION = "This package includes the documentation for texlive-duotenzor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn76130"

RPM_NAME = "texlive-duotenzor-doc-2026.226.1.00svn76130-59.2.noarch.rpm"
RPM_HASH = "43b84e549f4c518be90491036ea46cb40026dede18cd80b6cf1f6c24249c17dea1caa28b101a251db090724d40af82ba0fa3e1319e7b4b9963240a06c658e241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duotenzor-doc"

RDEPENDS:${PN} += ""

inherit rpm
