SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-pook-1.1.1-3.3.noarch.rpm"
RPM_HASH = "18e3ad47e89a624799cadecbd48c12cc751c85d3bf446c6b81cc7f135322db6b188ed9e949f443b2ad6619f131203f1c5d335655d0f58cdd03d584d5de092558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pook \
python311-pook \
python3dist-pook"

RDEPENDS:${PN} += "python-abi \
python311-aiohttp \
python311-furl \
python311-jsonschema \
python311-xmltodict"

inherit rpm
