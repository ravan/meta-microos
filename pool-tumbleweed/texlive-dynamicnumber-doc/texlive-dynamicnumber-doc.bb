SUMMARY = "Documentation for texlive-dynamicnumber"
DESCRIPTION = "This package includes the documentation for texlive-dynamicnumber"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn38726"

RPM_NAME = "texlive-dynamicnumber-doc-2026.226.0.0.1.3svn38726-61.4.noarch.rpm"
RPM_HASH = "20bcacd310468abd887ac84f4671c4181ba627dceec8c6abd5b22423cb2d73d3f3c5ef2b6eaae9c90ef0f12bf9febccad65642cf0c4c48b6a4d6a0eafc5c1ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynamicnumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
