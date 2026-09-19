SUMMARY = "Documentation for texlive-visualtoks"
DESCRIPTION = "This package includes the documentation for texlive-visualtoks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn76207"

RPM_NAME = "texlive-visualtoks-doc-2026.226.1.1bsvn76207-60.2.noarch.rpm"
RPM_HASH = "57dc3737a5649eede99934b1f2e8e430efda1c718d0608521b0e4d2525f28e2f9230fb3df60cec3895c84109d9d44cca0de4bca8f9689fa238b2a5c209d5c6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualtoks-doc"

RDEPENDS:${PN} += ""

inherit rpm
