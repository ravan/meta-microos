SUMMARY = "Documentation for texlive-ghsystem"
DESCRIPTION = "This package includes the documentation for texlive-ghsystem"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.8csvn77682"

RPM_NAME = "texlive-ghsystem-doc-2026.226.4.8csvn77682-60.2.noarch.rpm"
RPM_HASH = "0d1273fc355841c964cb29cb4c40e6ae9f05585d621d96354e9decb04590e5cb6fff7c6bf7f18f4773c2ae1f64953148ae7110cc73b2434fc8f6d18bb2d6375e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ghsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
