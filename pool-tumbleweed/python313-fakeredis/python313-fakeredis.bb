SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.37.1"

RPM_NAME = "python313-fakeredis-2.37.1-1.1.noarch.rpm"
RPM_HASH = "18e234f37f35692583fe2bacff49413c1ef26ab5d775bc314079cfd2d2b0e0d6e0cd1ce636a6b267102a7dfc4a790b895da0d877a9dc73879c18c15a30413933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fakeredis \
python3.13dist-fakeredis \
python313-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python313-redis \
python313-sortedcontainers"

inherit rpm
