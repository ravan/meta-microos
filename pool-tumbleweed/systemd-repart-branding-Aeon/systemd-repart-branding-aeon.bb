SUMMARY = "Aeon configuration for systemd-repart"
DESCRIPTION = "Aeon configuration for systemd-repart"
LICENSE = "MIT"

PV = "20240404"

RPM_NAME = "systemd-repart-branding-Aeon-20240404-7.3.noarch.rpm"
RPM_HASH = "9555b2f694870a30bd95c8558d21df98d97718026954c47a691f87e0c4622375431f91014e8c622e7b6bf8947888faf063baf74eed0c69d7bb33dc6a21524841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-repart-branding \
systemd-repart-branding-Aeon"

RDEPENDS:${PN} += ""

inherit rpm
