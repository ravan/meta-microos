SUMMARY = "Documentation for texlive-zeckendorf"
DESCRIPTION = "This package includes the documentation for texlive-zeckendorf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9dsvn77682"

RPM_NAME = "texlive-zeckendorf-doc-2026.226.0.0.9dsvn77682-59.4.noarch.rpm"
RPM_HASH = "cf598a2d8a56eb061d63e1830dc2571fc89af9d8620f64b138b41ce6e5da563e963f4409f4268146620ec2f2a45d2b392da6d5a2eeba71c7290cee8603819ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zeckendorf-doc"

RDEPENDS:${PN} += ""

inherit rpm
