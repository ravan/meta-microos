SUMMARY = "Command pipelines for python"
DESCRIPTION = "A wrapper for subprocess which provides command pipeline functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "python313-sarge-0.1.8-1.2.noarch.rpm"
RPM_HASH = "6ee56ea3978a29719b767c0ed30acc29d0f6b3a4af02fe6b7f25f90ef31ba5ac10fc02638a53b90f06f8878461123657604c47efb82747a62262ed6871e164f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sarge \
python3.13dist-sarge \
python313-sarge \
python3dist-sarge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
