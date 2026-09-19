SUMMARY = "Python OpenID client"
DESCRIPTION = "Python client for OpenID including token caching and management."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-openidc-client-0.6.0-2.5.noarch.rpm"
RPM_HASH = "373f135094ef2c75bf2ef0169acc3355e4d47b11110100e41793f014a015338837cb3b4636f165f904abe110af74c20dc161a6f98fd4c70c10b571cc41d56f99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openidc-client \
python3.13dist-openidc-client \
python313-openidc-client \
python3dist-openidc-client"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
