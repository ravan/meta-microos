SUMMARY = "Documentation for texlive-luabidi"
DESCRIPTION = "This package includes the documentation for texlive-luabidi"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn68432"

RPM_NAME = "texlive-luabidi-doc-2026.226.0.0.6svn68432-59.2.noarch.rpm"
RPM_HASH = "d1bb9eece625010e673fc9e0c6fa8fd44ac616466264c91b1fe71d3136ba8baac07f93faccfcc67652e4e712bfc79b94596d0ec9eb7ad77a3836bfdb4b9e5070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luabidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
