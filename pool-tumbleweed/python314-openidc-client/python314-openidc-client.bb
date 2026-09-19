SUMMARY = "Python OpenID client"
DESCRIPTION = "Python client for OpenID including token caching and management."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-openidc-client-0.6.0-2.5.noarch.rpm"
RPM_HASH = "b319d9bb27617e58721a4bc1c343df4ee47608d0f234c90c97321ed6eefc0a61e93f058f8887622aa766a20cbf4749bc25f9fceeb10312cf7f64a9fcd1ca8d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openidc-client \
python314-openidc-client \
python3dist-openidc-client"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
