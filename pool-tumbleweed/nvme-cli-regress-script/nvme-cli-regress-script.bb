SUMMARY = "A small script to test the nvme binary for regressions"
DESCRIPTION = "A small shell script to test the nvme binary for regressions. It requires an \
NVMe device for testing purposes. Do NOT use in a production environment."
LICENSE = "GPL-2.0-only"

PV = "3.0+6.g1ac60ca4b"

RPM_NAME = "nvme-cli-regress-script-3.0+6.g1ac60ca4b-1.1.noarch.rpm"
RPM_HASH = "5f9b3634437f463fa50b4e7d50668820018717310654859c8d81e86386e2cf901af6038385ea3b3b3b487e0bb1959ade94d83066ae8e5189a223b6e32b52c7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-regress-script"

RDEPENDS:${PN} += "/usr/bin/bash \
nvme-cli"

inherit rpm
