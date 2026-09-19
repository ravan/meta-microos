SUMMARY = "Cockpit component for Podman containers"
DESCRIPTION = "Cockpit component for managing Podman containers"
LICENSE = "LGPL-2.1-or-later"

PV = "129"

RPM_NAME = "cockpit-podman-129-1.1.noarch.rpm"
RPM_HASH = "2edcfea694eaa80af8542ced2302e01f9b410bd08ac79787d547aa14484ef7eb55b22adcdcac3add40877b2c935f91c241df954976d96da4ded9e953522909a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-podman"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
podman"

inherit rpm
