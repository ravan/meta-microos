SUMMARY = "Documentation for texlive-texdirflatten"
DESCRIPTION = "This package includes the documentation for texlive-texdirflatten"
LICENSE = "Artistic-1.0"

PV = "2026.227.1.3svn55064"

RPM_NAME = "texlive-texdirflatten-doc-2026.227.1.3svn55064-62.2.noarch.rpm"
RPM_HASH = "744f2b0353917d9eaefc28ae9db86229fc1c56ef53c1a293173a47b2197bc0cfe5c00131d0acb9fd94caa8f994813907b862d63a2c0ee3c895b505f09d1df136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdirflatten.1 \
texlive-texdirflatten-doc"

RDEPENDS:${PN} += ""

inherit rpm
