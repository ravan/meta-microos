SUMMARY = "A set of Python libraries that assist in calling the SoftLayer API"
DESCRIPTION = "This library provides a simple Python client to interact with SoftLayer's XML-RPC API."
LICENSE = "MIT"

PV = "6.2.9"

RPM_NAME = "python314-softlayer-6.2.9-1.2.noarch.rpm"
RPM_HASH = "7feeeb2c145a6243e0ccca5064e84fc3048101f41c9c4f24b2dd8fe263856283c141d7a4338b1a2b64076bc0c03a1439027a03edd29549f526de12fa4782448f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-softlayer \
python314-softlayer \
python3dist-softlayer"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-prompt-toolkit \
python314-pygments \
python314-requests \
python314-rich \
python314-urllib3 \
update-alternatives"

inherit rpm
