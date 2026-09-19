SUMMARY = "Documentation for texlive-elmath"
DESCRIPTION = "This package includes the documentation for texlive-elmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-elmath-doc-2026.226.1.2svn15878-61.4.noarch.rpm"
RPM_HASH = "a5bcd81613c04bf9f1ea603bd76ba4534312beb470223257e6b35f22592ab38e383cb0eb934fb810b0c0320ce2e6adb04cf09a9b7ecf29f38be2764409af1a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
