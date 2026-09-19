SUMMARY = "Python wrapper around the libevdev C library"
DESCRIPTION = "python-libevdev is a wrapper around the libevdev C library, with a \
pythonic API."
LICENSE = "MIT"

PV = "0.13.1"

RPM_NAME = "python313-libevdev-0.13.1-1.5.noarch.rpm"
RPM_HASH = "f33b445b20588178a5dba52c87d967d91a435ccecc0c128a36d3f82eb3f8eac11cbfc5505013f9e3e85dd913ef4c719ae0b1fea608aa597c7c4b2e10fdcceeeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libevdev \
python3.13dist-libevdev \
python313-libevdev \
python3dist-libevdev"

RDEPENDS:${PN} += "libevdev2 \
python-abi"

inherit rpm
