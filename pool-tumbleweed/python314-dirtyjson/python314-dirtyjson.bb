SUMMARY = "Python JSON decoder that can extract data from dirty input"
DESCRIPTION = "JSON decoder for Python that can extract data from dirty input."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python314-dirtyjson-1.0.8-2.5.noarch.rpm"
RPM_HASH = "138f1279c9a2f9bd6f78a620e01d23f7de9e9536320bd95d05e55a5197f4874ef5243ead56bf2809f9bce02fd6c18c2c3eacc08d6a0fe9148d0e43c1587e8df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dirtyjson \
python314-dirtyjson \
python3dist-dirtyjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
