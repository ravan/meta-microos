SUMMARY = "Python library for working with date and datetime objects"
DESCRIPTION = "Python library for working with date and datetime objects."
LICENSE = "0BSD"

PV = "0.6.12"

RPM_NAME = "python313-dateutils-0.6.12-3.5.noarch.rpm"
RPM_HASH = "2e351758941f03d1a49f4a965972fe19c7815185854e4f417470e7713366f0512d7d5c45cbf284e4582763b37f19cd8b0cd853b9459409623ffed266679d9876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dateutils \
python3.13dist-dateutils \
python313-dateutils \
python3dist-dateutils"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil \
python313-pytz"

inherit rpm
