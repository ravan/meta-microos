SUMMARY = "Post-build RPM inspection"
DESCRIPTION = "This subpackage runs post-build verification on generated RPMs."
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nvidia-open-driver-G06-signed-cuda-check-580.178.04-1.5.noarch.rpm"
RPM_HASH = "f3658bec8ed835d93b8aeeef240a7de63c16ab8987bf21121da3c82ab30b17e2fba12daeac94a8f28e8a8426c938a1feea64fd09456780f8cf6ab8db9db5519f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvidia-open-driver-G06-signed-cuda-check"

RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm
