SUMMARY = "Data format conversion routines to and from YAML"
DESCRIPTION = "Data format conversion routines to and from YAML."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python314-ruamel.yaml.convert-0.3.2-3.4.noarch.rpm"
RPM_HASH = "c693eb4a3dc93746b518cccd5d10742f7583e9e4012de74c132d3f7eaf22b1219796f72bb75387bce2f4c95ce98f485617016b0af3ad4da5b4dc68530f6dcfe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ruamel.yaml.convert \
python314-ruamel.yaml.convert \
python3dist-ruamel.yaml.convert"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil \
python314-ruamel.base \
python314-ruamel.yaml"

inherit rpm
