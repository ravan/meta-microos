SUMMARY = "Documentation for texlive-lua-unicode-math"
DESCRIPTION = "This package includes the documentation for texlive-lua-unicode-math"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-lua-unicode-math-doc-2026.226.0.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "b0af7a4a72c178374e0c4b805d19cd545b37b9d442af9a89222e44e47a823f1cf1286968f1594c0665da05670c2cf9d1b43bc894ffbf3cffe50b05aae9b2a89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-unicode-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
