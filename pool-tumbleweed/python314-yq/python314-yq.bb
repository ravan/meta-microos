SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.4.3"

RPM_NAME = "python314-yq-3.4.3-1.9.noarch.rpm"
RPM_HASH = "23c3f03558526a106c5b9539d25a2c759f5f716577360eee062516af0a3250866d2af766900b18a3a4e3d1c6b0d431ac70d2b8d8af1fbcb9feffef2721180f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yq \
python314-yq \
python3dist-yq"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
jq \
python-abi \
python314-PyYAML \
python314-argcomplete \
python314-tomlkit \
python314-xmltodict \
update-alternatives"

inherit rpm
