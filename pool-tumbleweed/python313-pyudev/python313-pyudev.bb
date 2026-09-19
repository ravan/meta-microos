SUMMARY = "Udev bindings for Python"
DESCRIPTION = "A Python binding to libudev, the hardware management library and service found \
in modern linux systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.4"

RPM_NAME = "python313-pyudev-0.24.4-1.4.noarch.rpm"
RPM_HASH = "68547935696991d2cd67fe4cce378988a947c59501129f7c661c9f418f9312cc13a1d2eb11287e7e23bada21d6f26c0f9ac98427a9a3df48c4046bf6b36578d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyudev \
python3.13dist-pyudev \
python313-pyudev \
python3dist-pyudev"

RDEPENDS:${PN} += "libudev1 \
python-abi"

inherit rpm
