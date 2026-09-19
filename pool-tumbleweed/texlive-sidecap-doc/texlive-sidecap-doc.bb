SUMMARY = "Documentation for texlive-sidecap"
DESCRIPTION = "This package includes the documentation for texlive-sidecap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7asvn77682"

RPM_NAME = "texlive-sidecap-doc-2026.226.1.7asvn77682-60.2.noarch.rpm"
RPM_HASH = "86be2f95af965b535fd0f26e394c59f79d1badd203ca0f5a8e18cd691df1ce7fab4eda0ef15c20fd7cf7d665412a04e177f55b0c895d05683a20ba6de1f95c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidecap-doc"

RDEPENDS:${PN} += ""

inherit rpm
