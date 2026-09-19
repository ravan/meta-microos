SUMMARY = "Development files for kgraphviewer"
DESCRIPTION = "Development files for kgraphviewer."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kgraphviewer-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5edab45be55be1e90266249d78fb0cad9c429de3b11c9ba4454cb46158c9703b7318ca17eb60a0f5e767058dc695ac89cdf032ae659f12c4ab4d4b56abb16160"

RPROVIDES:${PN} += "cmake-KGraphViewerPart \
kgraphviewer-devel"

RDEPENDS:${PN} += "kgraphviewer \
libkgraphviewer0"

inherit rpm
