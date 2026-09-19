SUMMARY = "Post-build RPM inspection"
DESCRIPTION = "This subpackage runs post-build verification on generated RPMs."
LICENSE = "GPL-2.0-only & MIT"

PV = "615.71.09"

RPM_NAME = "nvidia-open-driver-G07-signed-cuda-check-615.71.09-2.2.noarch.rpm"
RPM_HASH = "356940ae5aeed5c8b0711b4ae6d9edd9e1fa4c2ba6266490b60bf9c933b0e5b2bb1e177c8bc824a839cf2274dac5e13360740076d5704693de465b43a383f025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvidia-open-driver-G07-signed-cuda-check"

RDEPENDS:${PN} += "/usr/bin/sh \
bash"

inherit rpm
