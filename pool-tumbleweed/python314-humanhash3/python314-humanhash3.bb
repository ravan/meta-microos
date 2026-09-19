SUMMARY = "Human-readable representations of digests"
DESCRIPTION = "humanhash provides human-readable representations of digests."
LICENSE = "Unlicense"

PV = "0.0.6"

RPM_NAME = "python314-humanhash3-0.0.6-3.10.noarch.rpm"
RPM_HASH = "6036940b892492a31637f1b6a6f8b5120e096662850efa2ad8e988c026c52001956da4ebf07d125fc6f8a1903840da174e2bfd338ad0640aa70d46915679771e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-humanhash3 \
python314-humanhash3 \
python3dist-humanhash3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
