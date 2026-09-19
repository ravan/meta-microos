SUMMARY = "Documentation for texlive-linebreaker"
DESCRIPTION = "This package includes the documentation for texlive-linebreaker"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn77682"

RPM_NAME = "texlive-linebreaker-doc-2026.226.0.0.1csvn77682-61.2.noarch.rpm"
RPM_HASH = "f1a3be6e2f712ccd8622504b68d35656b33aebd780dabaf54daccecc5def9710d12e544fcbe76300b2aebeac776d4d62db292bd75086d9918bf10723e448e313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linebreaker-doc"

RDEPENDS:${PN} += ""

inherit rpm
