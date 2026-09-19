SUMMARY = "Documentation for texlive-pxpic"
DESCRIPTION = "This package includes the documentation for texlive-pxpic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-pxpic-doc-2026.226.1.5svn77682-60.4.noarch.rpm"
RPM_HASH = "d7db595f7f4703c1667c3dfaa21cc6d93d09f347a292aad0b89e9ce54400a7433d710d07b799e450a9bc3b7b6d5d297d50cbb51d9a94c9f046fbdc5dbee5ec6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
