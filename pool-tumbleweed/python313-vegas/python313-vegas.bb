SUMMARY = "Tools for adaptive multidimensional Monte Carlo integration"
DESCRIPTION = "Tools for adaptive multidimensional Monte Carlo integration."
LICENSE = "GPL-3.0-only"

PV = "6.4.1"

RPM_NAME = "python313-vegas-6.4.1-1.6.aarch64.rpm"
RPM_HASH = "3796ca4023ce656fa5d5f34dd7dc83aaf5478eec5e3b2c0c9b1565b032cff6c84b499e611a62a170e237cb03e115f498c80324f387add3b249e1275f63a82c96"

RPROVIDES:${PN} += "python3-vegas \
python3.13dist-vegas \
python313-vegas \
python3dist-vegas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-gvar \
python313-numpy"

inherit rpm
