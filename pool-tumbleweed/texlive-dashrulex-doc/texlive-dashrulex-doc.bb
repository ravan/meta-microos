SUMMARY = "Documentation for texlive-dashrulex"
DESCRIPTION = "This package includes the documentation for texlive-dashrulex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02dsvn76924"

RPM_NAME = "texlive-dashrulex-doc-2026.226.1.02dsvn76924-61.2.noarch.rpm"
RPM_HASH = "110b36d94b7bf80b5245383588b3f152839f1db862387eb46f0457d22a5e539c8d48f5307eb137cf7bf1c15fb27d124d12f80950841ef3a00a4d1eedc75afd64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashrulex-doc"

RDEPENDS:${PN} += ""

inherit rpm
