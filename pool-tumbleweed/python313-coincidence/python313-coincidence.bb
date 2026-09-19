SUMMARY = "Helper functions for pytest"
DESCRIPTION = "Helper functions for pytest."
LICENSE = "MIT"

PV = "0.6.6"

RPM_NAME = "python313-coincidence-0.6.6-2.7.noarch.rpm"
RPM_HASH = "94f3f5c66633496ffa5d68d26428074211e1948b75ebdee47733c03c013966c35471bf556169a8614df6916f40b7b7b5ef4f81a0da2b95625ee856a973cc188c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coincidence \
python3.13dist-coincidence \
python313-coincidence \
python3dist-coincidence"

RDEPENDS:${PN} += "python-abi \
python313-domdf-python-tools \
python313-pytest \
python313-pytest-regressions \
python313-typing-extensions"

inherit rpm
