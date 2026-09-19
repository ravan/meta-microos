SUMMARY = "A modern/fast Python SOAP client based on lxml / requests"
DESCRIPTION = "A modern/fast Python SOAP client based on lxml / requests"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python314-softlayer-zeep-5.0.0-6.7.noarch.rpm"
RPM_HASH = "ae2277491f321c63f5c15ab996c183a9806aa3a834ea84f8e1164ab3d642ee75ed64889bc719b7e64ec52a115da90c73122037f9c6056546317d1d82b2936886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-softlayer-zeep \
python314-softlayer-zeep \
python3dist-softlayer-zeep"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-isodate \
python314-legacy-cgi \
python314-lxml \
python314-platformdirs \
python314-pytz \
python314-requests \
python314-requests-file \
python314-requests-toolbelt"

inherit rpm
