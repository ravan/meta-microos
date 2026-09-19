SUMMARY = "A replacement of the contextlib module"
DESCRIPTION = "Contexter is a full replacement of the contextlib standard library \
module."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python313-contexter-0.1.4-3.5.noarch.rpm"
RPM_HASH = "3d48cac7bb207224cd7652d2c384fae9e8420a42c09b0083562bfdbf88a27e12fbea19fcab260cb10e16450c903e72b49c0dd050a855bbd43567e03fb961c9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-contexter \
python3.13dist-contexter \
python313-contexter \
python3dist-contexter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
