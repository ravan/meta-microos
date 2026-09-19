SUMMARY = "Documentation for the signon-qt library"
DESCRIPTION = "This package contains the documentation for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "libsignon-qt-docs-8.61-2.10.noarch.rpm"
RPM_HASH = "173b90fe3658b8620d52887bda0ef7eb9df4e724e00eae1105f4da7d959b904ecc8cc544143662d7c5a2ea0180acd473ab5b4f7689d19810bb33418132b25778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsignon-qt-docs"

RDEPENDS:${PN} += ""

inherit rpm
