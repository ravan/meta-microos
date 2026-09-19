SUMMARY = "Sphinx extension to display JSON Schema"
DESCRIPTION = "Sphinx extension to display JSON Schema."
LICENSE = "GPL-3.0-only"

PV = "1.19.2"

RPM_NAME = "python313-sphinx-jsonschema-1.19.2-1.4.noarch.rpm"
RPM_HASH = "02ee8e224c52b120938148ee17b999225812ddf9d8ee616e5a5421053023e7530667aee126b700dfed8fb87ab2622fcec95cf7679d705b489ab3000b807d34f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-jsonschema \
python3.13dist-sphinx-jsonschema \
python313-sphinx-jsonschema \
python3dist-sphinx-jsonschema"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-docutils \
python313-jsonpointer \
python313-requests"

inherit rpm
