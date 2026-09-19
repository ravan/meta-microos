SUMMARY = "Documentation for qt6-canvaspainter in QCH format"
DESCRIPTION = "This package contains documentation for qt6-canvaspainter in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-canvaspainter-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "33909559a93a630c6fc0f2edaa912fa02a988c2ead71f8876c89c1375cc6ae81b3b64f150dae26f2e3c0b744548a5c6a2e62cd21f07846827812697a9409d24c"

RPROVIDES:${PN} += "qt6-canvaspainter-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
