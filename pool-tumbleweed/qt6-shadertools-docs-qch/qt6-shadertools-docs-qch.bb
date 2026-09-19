SUMMARY = "Documentation for qt6-shadertools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-shadertools-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2bc87602a9cf202e37c3690aadf489e0dd8102c4fc2e2b4e18be931d6a2e247c12bf6c0bc3f4378c834b64c057a71cbd7f92afc1c5e5f42be708ca242bf0be06"

RPROVIDES:${PN} += "qt6-shadertools-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
