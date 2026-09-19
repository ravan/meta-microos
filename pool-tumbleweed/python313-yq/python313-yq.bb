SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.4.3"

RPM_NAME = "python313-yq-3.4.3-1.9.noarch.rpm"
RPM_HASH = "84bad8d71967b4fdaa21c9405ca322b41cf26ed326649288e31189a481bf62a19668fa494d09a13ecc19d6cf3ebb7d7f500dbc833bd195c46ad6e434ae3b4949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yq \
python3.13dist-yq \
python313-yq \
python3dist-yq"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
jq \
python-abi \
python313-PyYAML \
python313-argcomplete \
python313-tomlkit \
python313-xmltodict \
update-alternatives"

inherit rpm
