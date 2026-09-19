SUMMARY = "Health-checker plugins for openSUSE MicroOS"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the openSUSE MicroOS did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.13+git20260414.bb3e4ad"

RPM_NAME = "health-checker-plugins-MicroOS-1.13+git20260414.bb3e4ad-1.2.noarch.rpm"
RPM_HASH = "32625d6f2ab1c233e18c8da2e2ed8b3839cbb13eead63fe7715b3b7efc3dbb18b8a3cc0201fe97d7c3b4ec5e254f2505406876f66c42e46df07aa317da2028df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-plugins-MicroOS"

RDEPENDS:${PN} += "/usr/bin/bash \
health-checker"

inherit rpm
