SUMMARY = "Documentation for texlive-luaplot"
DESCRIPTION = "This package includes the documentation for texlive-luaplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn68918"

RPM_NAME = "texlive-luaplot-doc-2026.226.1.5svn68918-59.2.noarch.rpm"
RPM_HASH = "0c5777b317a1a5615441a58169f22954455618c60ce4e28ef705f3e30918579843eb5481338c1b3ac15372dde2f2eeedd57ab9505ff58471227b597475fd2718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
