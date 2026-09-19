SUMMARY = "JsonDecoder for ndjson"
DESCRIPTION = "JsonDecoder for ndjson"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python314-ndjson-0.3.1-1.16.noarch.rpm"
RPM_HASH = "44af66f38c53a9d5d376ed630fba8570433bafa825c562554a2794a068f43879d007a92f826907a9b1d4f0a49137a405eb5e86f0c84b4cdd42c38e1235f89a43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ndjson \
python314-ndjson \
python3dist-ndjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
