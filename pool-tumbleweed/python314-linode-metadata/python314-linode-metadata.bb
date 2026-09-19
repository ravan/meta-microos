SUMMARY = "A client to interact with the Linode Metadata service in Python"
DESCRIPTION = "A client to interact with the Linode Metadata service in Python."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python314-linode-metadata-0.3.5-1.2.noarch.rpm"
RPM_HASH = "73d27611b0617b85828cff8941ce6e406a1aecbf67e8ce3e5888fa4cd4db277075570ba5483e9536f192e35c3e9ce061795ff1fd5faca5c9cf4c2b4cd3365f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-linode-metadata \
python314-linode-metadata \
python3dist-linode-metadata"

RDEPENDS:${PN} += "python-abi \
python314-httpx"

inherit rpm
