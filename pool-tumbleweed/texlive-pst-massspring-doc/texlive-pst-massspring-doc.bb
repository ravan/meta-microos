SUMMARY = "Documentation for texlive-pst-massspring"
DESCRIPTION = "This package includes the documentation for texlive-pst-massspring"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77131"

RPM_NAME = "texlive-pst-massspring-doc-2026.226.0.0.01svn77131-59.2.noarch.rpm"
RPM_HASH = "facb7e02ab03993a790b5907e1e37793ff1def5d194303dc05bb9c792ac5a29c5d455cabf8b54b59500eb7c6e64e8af6e4d929c984f47852364e77c5f5c14942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-massspring-doc"

RDEPENDS:${PN} += ""

inherit rpm
