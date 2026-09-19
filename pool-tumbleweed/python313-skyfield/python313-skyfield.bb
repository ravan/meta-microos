SUMMARY = "Elegant astronomy for Python"
DESCRIPTION = "A Python astronomy package that makes it easy to generate high precision \
research-grade positions for planets and Earth satellites."
LICENSE = "MIT"

PV = "1.54"

RPM_NAME = "python313-skyfield-1.54-2.1.noarch.rpm"
RPM_HASH = "6746d47860baa02dc41f459492ed4bf287f7aed59fdff259d11105e9210a0211609b63f66c5fd2443ac756a1b8dcd17daaa5013b7f0f6bdcc099c8235cf9af87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-skyfield \
python3.13dist-skyfield \
python313-skyfield \
python3dist-skyfield"

RDEPENDS:${PN} += "python-abi \
python313-certifi \
python313-jplephem \
python313-numpy \
python313-sgp4"

inherit rpm
