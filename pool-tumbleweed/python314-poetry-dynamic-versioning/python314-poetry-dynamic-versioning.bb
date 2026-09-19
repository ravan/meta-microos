SUMMARY = "Plugin for Poetry to enable dynamic versioning based on VCS tags"
DESCRIPTION = "Plugin for Poetry to enable dynamic versioning based on VCS tags."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python314-poetry-dynamic-versioning-1.10.0-1.4.noarch.rpm"
RPM_HASH = "0e73331d2eb2efec91c76bed4cf14a5fb08c8085afc15abbd6951f2c9ed24b6905cc1f1d208440b95108e2a61a60515c4e1ad4433ff024549bbb775e1365223b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-poetry-dynamic-versioning \
python314-poetry-dynamic-versioning \
python3dist-poetry-dynamic-versioning"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Jinja2 \
python314-dunamai \
python314-tomlkit \
update-alternatives"

inherit rpm
