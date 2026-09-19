SUMMARY = "Manual pages for librmt functions"
DESCRIPTION = "This subpackage contains the manual pages for librmt's functions."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "librmt-devel-doc-2024.03.21-53.5.noarch.rpm"
RPM_HASH = "093485b5ed2ee609f0b370f1cad13fedb3dd9659b26b0671503d518e0989910ebf3a8f7b892cd6710e33e3153bacf9bf7ffaa37a1c877d41fb168c58187cf15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librmt-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
