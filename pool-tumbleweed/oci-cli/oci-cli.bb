SUMMARY = "Oracle Cloud Infrastructure CLI"
DESCRIPTION = "The CLI is a small footprint tool that you can use on its own or with the \
Console to complete Oracle Cloud Infrastructure tasks. The CLI provides \
the same core functionality as the Console, plus additional commands. \
Some of these, such as the ability to run scripts, extend the Console's \
functionality."
LICENSE = "Apache-2.0"

PV = "3.83.0"

RPM_NAME = "oci-cli-3.83.0-1.2.noarch.rpm"
RPM_HASH = "148bec0cf0450d76c1f458e31f103dfd920c1c2d241e2cf51dd721b60b89437f1fdd58808fe56faab48693b8c3dc2c85fb75a3608d724c90caea0b879d5c9049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oci-cli \
python3.13dist-oci-cli \
python3dist-oci-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-PyYAML \
python313-arrow \
python313-certifi \
python313-click \
python313-cryptography \
python313-jmespath \
python313-oci-sdk \
python313-prompt-toolkit \
python313-pyOpenSSL \
python313-python-dateutil \
python313-pytz \
python313-six \
python313-terminaltables"

inherit rpm
