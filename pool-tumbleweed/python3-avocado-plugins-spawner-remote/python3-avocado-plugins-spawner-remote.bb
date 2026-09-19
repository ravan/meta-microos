SUMMARY = "Avocado spawner for running tests on a remote host"
DESCRIPTION = "This optional plugin adds a spawner that runs Avocado tests on a remote \
host over SSH."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-plugins-spawner-remote-113.0-1.2.noarch.rpm"
RPM_HASH = "165e3f33aa9bcebdd6596229dfe555d9f0d20e612817ce84e2d159f20e502121384545fcebd17f0738e14ef54fd53718e834bacc09ca372f490a9b3d68f82bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-spawner-remote \
python3.13dist-avocado-framework-plugin-spawner-remote \
python3dist-avocado-framework-plugin-spawner-remote"

RDEPENDS:${PN} += "python-abi \
python3-aexpect \
python3-avocado"

inherit rpm
