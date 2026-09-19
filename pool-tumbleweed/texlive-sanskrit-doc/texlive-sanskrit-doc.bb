SUMMARY = "Documentation for texlive-sanskrit"
DESCRIPTION = "This package includes the documentation for texlive-sanskrit"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.4_bsvn76869"

RPM_NAME = "texlive-sanskrit-doc-2026.226.2.2.4_bsvn76869-60.2.noarch.rpm"
RPM_HASH = "c29e03af627d3b17895650534848c185e5cf575bc3386ee4a501990b09689fe2739d4cd3036119bf1b11c8918eb7fa34eaea5e700739c51ebb5445b6d24aef8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanskrit-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
