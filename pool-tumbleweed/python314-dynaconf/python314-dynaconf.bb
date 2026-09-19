SUMMARY = "The dynamic configurator for your Python Project"
DESCRIPTION = "The dynamic configurator for your Python Project"
LICENSE = "MIT"

PV = "3.3.5"

RPM_NAME = "python314-dynaconf-3.3.5-2.1.noarch.rpm"
RPM_HASH = "08296fd3e3aa438140c08cff05b08414a6c726958f6eca8bb0b568d701838187ff33a6875821bcf8103d059d8b75149711bacd3b8becb9e801de9533a361e342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dynaconf \
python314-dynaconf \
python3dist-dynaconf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-click \
python314-configobj \
python314-hvac \
python314-python-box \
python314-python-dotenv \
python314-redis \
python314-setuptools \
python314-toml"

inherit rpm
