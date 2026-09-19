SUMMARY = "Binary files of platex"
DESCRIPTION = "Binary files of platex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn67315"

RPM_NAME = "texlive-platex-bin-2026.20260301.svn67315-120.4.aarch64.rpm"
RPM_HASH = "d28be8ee087ca12063c220181d796133cef527ed94438d5ce9e9708f3fd359d93b5d3a2ae4f1a8c47cd703fb67d9f696742da43bab39b0c2192e2afba4bbdd26"

RPROVIDES:${PN} += "texlive-platex-bin"

RDEPENDS:${PN} += "texlive-platex"

inherit rpm
