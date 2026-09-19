SUMMARY = "Documentation for texlive-gitlog"
DESCRIPTION = "This package includes the documentation for texlive-gitlog"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-doc-2026.226.0.0.0.betasvn38932-60.4.noarch.rpm"
RPM_HASH = "9e0d08c348939e64d30bc811cd9b3dec2a0685b22914b5bc9db4c5067ad9edda0c01d8813bdf1b7e9bdb2c2ed0c92fd64f995da67d1e1d88a1b627d2ac5f5e16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitlog-doc"

RDEPENDS:${PN} += ""

inherit rpm
