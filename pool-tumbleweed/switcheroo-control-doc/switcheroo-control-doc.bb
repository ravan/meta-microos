SUMMARY = "Documentation for switcheroo-control"
DESCRIPTION = "This package contains the documentation for switcheroo-control."
LICENSE = "GPL-3.0-only"

PV = "3.0"

RPM_NAME = "switcheroo-control-doc-3.0-1.6.noarch.rpm"
RPM_HASH = "3f307f1ae3bafb71873f66069cb2f9bd8e0354d0aaf08f91241e7e2603ba69c1d5e72344067aa0e331af94c4cbe52fe9a39696d114990a4f9b0eeccd882af447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "switcheroo-control-doc"

RDEPENDS:${PN} += ""

inherit rpm
