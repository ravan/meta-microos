SUMMARY = "Epic Games Windows integration for Heroic"
DESCRIPTION = "Wrapper process for games launched through Heroic Games Launcher"
LICENSE = "GPL-3.0-only"

PV = "0.4"

RPM_NAME = "heroic-epic-integration-0.4-1.3.noarch.rpm"
RPM_HASH = "4e7fbeb672af4a7365d3e7110f8648ca4f1904866a56e43605c3c75aba0dee3723bed34083ba1abcc8936173aec11b2912bc4f3ddbfed9a1c557be3cfd74d808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "heroic-epic-integration"

RDEPENDS:${PN} += ""

inherit rpm
