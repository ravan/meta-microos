SUMMARY = "Distributed quantile sketches"
DESCRIPTION = "Distributed quantile sketches"
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "python314-ddsketch-3.0.1-1.9.noarch.rpm"
RPM_HASH = "837f16164ec4bf241e2bd51493db033cb7ba2c8ac20821e1527cd27703a9c803870b9ac5823b87bf073a6afc75dce60965672dbb48d00be3159ba44a5728f4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ddsketch \
python314-ddsketch \
python3dist-ddsketch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
