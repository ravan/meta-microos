SUMMARY = "Jupyter nbagg backend for python314-matplotlib"
DESCRIPTION = "This package includes the Jupyter notebook backend \
for the python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-nbagg-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "357706ad43c6d609dce1e18a42f02ce0cd56d569155e5b07c68a9451e3518bdf4db32e44a15c4c50856260970f325d2f203d61f8905aa769c7b95d04a331a6ee"

RPROVIDES:${PN} += "python314-matplotlib-nbagg"

RDEPENDS:${PN} += "python-abi \
python314-ipykernel \
python314-matplotlib"

inherit rpm
