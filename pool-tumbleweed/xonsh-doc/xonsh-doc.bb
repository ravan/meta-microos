SUMMARY = "Documentation files for xonsh"
DESCRIPTION = "HTML documentation on the API and examples for xonsh."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "xonsh-doc-0.24.0-1.1.noarch.rpm"
RPM_HASH = "51768a0dcd4b69c9178d719d6fe3de93c747ce1c40f031135ed119ef55ca51c5718a0e183ac7cc16adfa2a1571078f19a969eebba0b7373bfa9bf0e78ebd65ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xonsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
