SUMMARY = "Documentation for texlive-pagenote"
DESCRIPTION = "This package includes the documentation for texlive-pagenote"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-pagenote-doc-2026.226.1.1asvn77682-58.2.noarch.rpm"
RPM_HASH = "7891fad6303e512d29049f6760eba0cda74854c26eeab36f636dd6456b0fd8bb9f25d11366766e2e15aeb88aad18abdafb11da33f21e9513104e61717d8338b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagenote-doc"

RDEPENDS:${PN} += ""

inherit rpm
