SUMMARY = "The dynamic configurator for your Python Project"
DESCRIPTION = "The dynamic configurator for your Python Project"
LICENSE = "MIT"

PV = "3.3.5"

RPM_NAME = "python313-dynaconf-3.3.5-2.1.noarch.rpm"
RPM_HASH = "67d9347500a75242a9cbd3a4ef7ca6baeba8738e933f431f4c0e91cb9a0ce6d8adc2fdfed6a90d34474d20c661be406c199b1162241b71ed33908b6f2677b804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dynaconf \
python3.13dist-dynaconf \
python313-dynaconf \
python3dist-dynaconf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-click \
python313-configobj \
python313-hvac \
python313-python-box \
python313-python-dotenv \
python313-redis \
python313-setuptools \
python313-toml"

inherit rpm
