SUMMARY = "Development tools for caja-actions"
DESCRIPTION = "The caja-actions-devel package contains the header files caja-actions."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-actions-devel-1.28.0-1.10.noarch.rpm"
RPM_HASH = "cc0079cdf8ba7d8d00890db6768a5d6065c3d58b7031f798be8f8e3853e4be40c6f95a345ed1d4f03cbf9f8b2515fa28c510d9b0a0aa9025404c9f486215ea52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-actions-devel"

RDEPENDS:${PN} += ""

inherit rpm
