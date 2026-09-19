SUMMARY = "Plugin for Poetry to enable dynamic versioning based on VCS tags"
DESCRIPTION = "Plugin for Poetry to enable dynamic versioning based on VCS tags."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python313-poetry-dynamic-versioning-1.10.0-1.4.noarch.rpm"
RPM_HASH = "bc270122905905783c9ff72d0557248203d56c0e0a476188f1aeb337b0a28f9e8e4081b0050ac165ef0ab3026b7b8f7bb9a6c92b531f13c521e241c6509d9696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-dynamic-versioning \
python3.13dist-poetry-dynamic-versioning \
python313-poetry-dynamic-versioning \
python3dist-poetry-dynamic-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Jinja2 \
python313-dunamai \
python313-tomlkit \
update-alternatives"

inherit rpm
