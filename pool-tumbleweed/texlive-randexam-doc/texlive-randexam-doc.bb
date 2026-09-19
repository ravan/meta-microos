SUMMARY = "Documentation for texlive-randexam"
DESCRIPTION = "This package includes the documentation for texlive-randexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.2024fsvn71883"

RPM_NAME = "texlive-randexam-doc-2026.226.2024fsvn71883-60.4.noarch.rpm"
RPM_HASH = "544b1c3e953c62b60d878e7b19a31789c024f7307699d030474463976672357d339dc586cb2da7368254d287983a2041f2967db511b3f245ae6f64447f057942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
