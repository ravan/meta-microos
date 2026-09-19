SUMMARY = "Documentation how to use mate-applets"
DESCRIPTION = "This package contains the documentation for mate-applets"
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-applets-doc-1.28.0-1.11.noarch.rpm"
RPM_HASH = "8b480d9e5d8daae5379c393e9baa605e2c31a1c32fe152a9ea22952c5befa20dc5dbba1736d8fc2b21883561856243cf1fbebee71be008c0e8bea275d102024d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-applets-doc"

RDEPENDS:${PN} += ""

inherit rpm
