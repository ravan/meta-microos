SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "2.23.0"

RPM_NAME = "python313-hcloud-2.23.0-1.1.noarch.rpm"
RPM_HASH = "323226aff9f4e83b6686851e2d8b1694d9f23505d0c35a337b5ccfa073c67589672192f11c3e2d914e5743729873269fd92c5e920c14472a0d257f0959efc6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hcloud \
python3.13dist-hcloud \
python313-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil \
python313-requests"

inherit rpm
