SUMMARY = "A modern/fast Python SOAP client based on lxml / requests"
DESCRIPTION = "A modern/fast Python SOAP client based on lxml / requests"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python313-softlayer-zeep-5.0.0-6.7.noarch.rpm"
RPM_HASH = "9551489bc824b47d13b31c40eb761aee3738a58d98cba8a1ec6a9b25bbbacd77fdc3e6e32483da77f06fc76e7465323c03c5daa5e67fc3439df1e106cd1d0e57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-softlayer-zeep \
python3.13dist-softlayer-zeep \
python313-softlayer-zeep \
python3dist-softlayer-zeep"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-isodate \
python313-legacy-cgi \
python313-lxml \
python313-platformdirs \
python313-pytz \
python313-requests \
python313-requests-file \
python313-requests-toolbelt"

inherit rpm
