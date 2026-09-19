SUMMARY = "Astropy affiliated package for accessing Virtual Observatory data and services"
DESCRIPTION = "Astropy affiliated package for accessing Virtual Observatory data and services"
LICENSE = "BSD-3-Clause"

PV = "1.8.1"

RPM_NAME = "python313-pyvo-1.8.1-1.3.noarch.rpm"
RPM_HASH = "b2948dbdc91bcc3b0195d30b004f8906a98b9f71b5f4b32d6b4dc703c2c3bf23e5ffa3924a4396fad85a6efed473ddf48f487777d3194b19cbf3c9d1cea5b673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvo \
python3.13dist-pyvo \
python313-pyvo \
python3dist-pyvo"

RDEPENDS:${PN} += "python-abi \
python313-astropy \
python313-requests"

inherit rpm
