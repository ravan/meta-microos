SUMMARY = "Python tool configuration"
DESCRIPTION = "Python Tool Configuration \
 \
The goal of this project is to manage configuration for python tools, \
such as black and rope and add support for a pyproject.toml configuration file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "python313-pytoolconfig-1.3.1-1.11.noarch.rpm"
RPM_HASH = "e9f9d02860aa38718cabdbd4d76910929320153a86d6f02999b3192e04f624cd69ff54431d1e23aeb401c55bf8c74f69612e3ae83d6b1ab4eb66820b555d36d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoolconfig \
python3.13dist-pytoolconfig \
python313-pytoolconfig \
python3dist-pytoolconfig"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
