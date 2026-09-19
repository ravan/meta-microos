SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.200.0"

RPM_NAME = "python313-google-api-python-client-2.200.0-1.1.noarch.rpm"
RPM_HASH = "ad44a8b4a6b450c42aa5e40a391540f967ac3163edaa46bf6b52d22f28d5d3fcce454294c1dd044d0fdd07982828d51f0faba7861a78dc3537e3b40bd62f4583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client \
python3-google-api-python-client \
python3.13dist-google-api-python-client \
python313-google-api-python-client \
python3dist-google-api-python-client"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-google-auth-httplib2 \
python313-httplib2 \
python313-uritemplate"

inherit rpm
