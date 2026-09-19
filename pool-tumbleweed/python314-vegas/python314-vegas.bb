SUMMARY = "Tools for adaptive multidimensional Monte Carlo integration"
DESCRIPTION = "Tools for adaptive multidimensional Monte Carlo integration."
LICENSE = "GPL-3.0-only"

PV = "6.4.1"

RPM_NAME = "python314-vegas-6.4.1-1.6.aarch64.rpm"
RPM_HASH = "cc037e51f2724d68965212e48e00a9e35b20495f662099172291c47b4a25d413b1a40160ed51870e8f3c738cb44ef0753241992c7f119d5ebf1e8f9cbf72b169"

RPROVIDES:${PN} += "python3.14dist-vegas \
python314-vegas \
python3dist-vegas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-gvar \
python314-numpy"

inherit rpm
