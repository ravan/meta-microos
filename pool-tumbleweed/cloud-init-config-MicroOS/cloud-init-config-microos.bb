SUMMARY = "openSUSE MicroOS configuration file for could-init"
DESCRIPTION = "This package contains the openSUSE MicroOS specific \
configuration file for cloud-init."
LICENSE = "GPL-3.0-only"

PV = "1.1"

RPM_NAME = "cloud-init-config-MicroOS-1.1-3.8.noarch.rpm"
RPM_HASH = "13543fa4bd29edc13aa4ead84aa9cf54d6716aba3523c91f813bc433e59bdbf27698a22304e79a01472d6ea91b4d0e17faaaf8349128345c0327e7b4f391d74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-init-config \
cloud-init-config-MicroOS \
config-cloud-init-config-MicroOS"

RDEPENDS:${PN} += "cloud-init"

inherit rpm
