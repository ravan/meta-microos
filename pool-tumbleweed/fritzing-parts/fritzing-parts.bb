SUMMARY = "Electronic components for use in the Fritzing app (aka the parts library)"
DESCRIPTION = "This packages contains the parts definitions for the electronic \
components used in the Fritzing app."
LICENSE = "CC-BY-SA-3.0"

PV = "1.0.8"

RPM_NAME = "fritzing-parts-1.0.8-1.1.noarch.rpm"
RPM_HASH = "7dd6f35fa8e90f98f504c2088c47c46f9ae4395b69cea27d14306757c757c69299f95b498e7ed2c61bff2c2a698bfee0d5eeb92fe53d06d1eb6f075a17295d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fritzing-parts"

RDEPENDS:${PN} += ""

inherit rpm
