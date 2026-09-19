SUMMARY = "Documentation for texlive-halloweenmath"
DESCRIPTION = "This package includes the documentation for texlive-halloweenmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn77682"

RPM_NAME = "texlive-halloweenmath-doc-2026.226.0.0.11svn77682-60.4.noarch.rpm"
RPM_HASH = "cf5577c1eb964576a946157ab18c8c550b7227494a2ffb840f9b13f3b53b28c1d68e3c0af60fc65339a1ac050ce6abe43bc35585689e1c4317e6b1cb0391d413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-halloweenmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
