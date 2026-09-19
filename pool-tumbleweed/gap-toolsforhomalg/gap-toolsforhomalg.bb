SUMMARY = "GAP: Special methods and knowledge propagation tools"
DESCRIPTION = "The ToolsForHomalg package provides GAP extensions for the homalg \
project."
LICENSE = "GPL-2.0-only"

PV = "2026.04.01"

RPM_NAME = "gap-toolsforhomalg-2026.04.01-1.2.noarch.rpm"
RPM_HASH = "7ddb42d22dc0f71c8791075078c43a51b5a246dd45cc40a7b1d33a6b219c077ccd5c5c73a9006446860d6ddfb2f5c527d10c05ed408983e1d2b8f2e1942bbd3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-toolsforhomalg"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core"

inherit rpm
