SUMMARY = "Datamodel Code Generator"
DESCRIPTION = "Python Datamodel Code Generator."
LICENSE = "MIT"

PV = "0.72.3"

RPM_NAME = "python313-datamodel-code-generator-0.72.3-1.1.noarch.rpm"
RPM_HASH = "ac2328aafef1637fc5733b916f2ccd0aeecdc091cdaee4c78734a4c4f42870b234fa2013f723a5741fef99c53042735c05855666d2075808cca5dbb13e912323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-datamodel-code-generator \
python3.13dist-datamodel-code-generator \
python313-datamodel-code-generator \
python3dist-datamodel-code-generator"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-argcomplete \
python313-black \
python313-genson \
python313-inflect \
python313-isort \
python313-jinja2 \
python313-pydantic \
python313-toml \
update-alternatives"

inherit rpm
