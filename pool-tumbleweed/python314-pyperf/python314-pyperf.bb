SUMMARY = "Python module to run and analyze benchmarks"
DESCRIPTION = "Python module to run and analyze benchmarks."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python314-pyperf-2.10.0-1.3.noarch.rpm"
RPM_HASH = "f6bc03fb3e0b077f6cf318c155c593996171a810ee6e2e3867c24da5c42767335b2e0c4ca067c11b14de7cedea03c9463ee292b404f6af12f5c4bad96fa6e51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyperf \
python314-pyperf \
python3dist-pyperf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
