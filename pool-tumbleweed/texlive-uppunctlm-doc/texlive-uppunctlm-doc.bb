SUMMARY = "Documentation for texlive-uppunctlm"
DESCRIPTION = "This package includes the documentation for texlive-uppunctlm"
LICENSE = "LPPL-1.3c"

PV = "2026.226.0.0.1svn42334"

RPM_NAME = "texlive-uppunctlm-doc-2026.226.0.0.1svn42334-60.2.noarch.rpm"
RPM_HASH = "c68ca188a8b28f6ba3550dd45ad446f8bf324d31f0137b83a4aa6b68a82a114d7194ec5451cf84aa7d6f5300a4a0757c11c13b07c6c4cd51e9612006f54e4998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uppunctlm-doc"

RDEPENDS:${PN} += ""

inherit rpm
