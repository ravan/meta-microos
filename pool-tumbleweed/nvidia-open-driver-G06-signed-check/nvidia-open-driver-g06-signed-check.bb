SUMMARY = "Post-build RPM inspection"
DESCRIPTION = "This subpackage runs post-build verification on generated RPMs."
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nvidia-open-driver-G06-signed-check-580.178.04-1.5.noarch.rpm"
RPM_HASH = "2803b4be3a2d846dbef2056d8b40e477e3ab7806137037cbddb985e399e4e84850e05c5db90dee5a7b7c19da799a302137b7be383314eb66b48b7929b1e0511d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvidia-open-driver-G06-signed-check"

RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm
