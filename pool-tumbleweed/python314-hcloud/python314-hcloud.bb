SUMMARY = "Hetzner Cloud Python library"
DESCRIPTION = "Official Hetzner Cloud Python library."
LICENSE = "MIT"

PV = "2.23.0"

RPM_NAME = "python314-hcloud-2.23.0-1.1.noarch.rpm"
RPM_HASH = "7305a8b25ae42c2d7422b54742fd40d1a22c1aed42be23fb55b654f4ddb05eb23593c1712ea798bb3473c2bd4cd75a84c635e11a965bf5f81ff9667a4bc389a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hcloud \
python314-hcloud \
python3dist-hcloud"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil \
python314-requests"

inherit rpm
