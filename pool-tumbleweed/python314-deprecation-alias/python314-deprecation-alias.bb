SUMMARY = "A wrapper around 'deprecation' providing support for deprecated aliases"
DESCRIPTION = "A wrapper around 'deprecation' providing support for deprecated aliases."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python314-deprecation-alias-0.4.0-1.3.noarch.rpm"
RPM_HASH = "fbf540d42622b7d0dabfae9aca1bbf7d2985d73d112d2087129b268795e9ee4a3945bf85b5de63dc3de19c9e72c875b53fff6d85a076b5a91c11b0a2c7e6b461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-deprecation-alias \
python314-deprecation-alias \
python3dist-deprecation-alias"

RDEPENDS:${PN} += "python-abi \
python314-deprecation \
python314-packaging"

inherit rpm
