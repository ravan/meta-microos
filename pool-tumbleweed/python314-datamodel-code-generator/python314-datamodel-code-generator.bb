SUMMARY = "Datamodel Code Generator"
DESCRIPTION = "Python Datamodel Code Generator."
LICENSE = "MIT"

PV = "0.72.3"

RPM_NAME = "python314-datamodel-code-generator-0.72.3-1.1.noarch.rpm"
RPM_HASH = "eea6c7ba19f2b9afb528fd56b3807932e381b459d9a91b08c53a0bc6726c726c18a53e643d80ed54b467e9838a96fa2d24b6e52c95902439345b166232beee99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-datamodel-code-generator \
python314-datamodel-code-generator \
python3dist-datamodel-code-generator"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-argcomplete \
python314-black \
python314-genson \
python314-inflect \
python314-isort \
python314-jinja2 \
python314-pydantic \
python314-toml \
update-alternatives"

inherit rpm
