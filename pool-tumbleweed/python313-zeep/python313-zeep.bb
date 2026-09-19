SUMMARY = "A Python SOAP client based on lxml/requests"
DESCRIPTION = "Python SOAP client based on python-lxml and python-requests"
LICENSE = "MIT"

PV = "4.3.3"

RPM_NAME = "python313-zeep-4.3.3-1.2.noarch.rpm"
RPM_HASH = "78255736e2643814163fc5dbb618f3087bfe6282c86ddc82d94d632be406f60663975806019cf166abe02d3215a30ab98314fd091fc7a0b78aa4358b066ecd43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zeep \
python3.13dist-zeep \
python313-zeep \
python3dist-zeep"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-isodate \
python313-lxml \
python313-platformdirs \
python313-pytz \
python313-requests \
python313-requests-file \
python313-requests-toolbelt"

inherit rpm
