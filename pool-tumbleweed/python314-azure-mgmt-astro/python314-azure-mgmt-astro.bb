SUMMARY = "Microsoft Azure Astro Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Astro Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-astro-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "2508af66443d61971d86dfa3a30a1a81ce1ba88c74db7f25e56dcedb69d5ed8eb9bf30d813835a24d860b0f39dfc3e61443a4665ff8c5667a1bfac3f4588f102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-astro \
python314-azure-mgmt-astro \
python3dist-azure-mgmt-astro"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
