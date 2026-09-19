SUMMARY = "Simple DNS resolver for asyncio"
DESCRIPTION = "Simple DNS resolver for asyncio module."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python314-aiodns-4.0.4-1.2.noarch.rpm"
RPM_HASH = "a5f022a4de0dc90543e080e0a2bbeee47e1ad81c874d32a2dbc82cd965df571c5267b1739ac317391d1c445acbf9dd82f34ae8d86fcf674798a77204bfb2941a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiodns \
python314-aiodns \
python3dist-aiodns"

RDEPENDS:${PN} += "python-abi \
python314-pycares"

inherit rpm
