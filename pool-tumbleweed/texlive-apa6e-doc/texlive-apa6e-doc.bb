SUMMARY = "Documentation for texlive-apa6e"
DESCRIPTION = "This package includes the documentation for texlive-apa6e"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.3svn23350"

RPM_NAME = "texlive-apa6e-doc-2026.226.0.0.3svn23350-61.2.noarch.rpm"
RPM_HASH = "86e371f8716d16b37d61ce0ef00ba6f28a53153920d10dd6bfa9754a6095a8c6b8b732c43aff5a7349b4ac3940c1c1c807bf9f3a83a3c63d5370e6574bac5e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa6e-doc"

RDEPENDS:${PN} += ""

inherit rpm
