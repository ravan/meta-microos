SUMMARY = "Python tool configuration"
DESCRIPTION = "Python Tool Configuration \
 \
The goal of this project is to manage configuration for python tools, \
such as black and rope and add support for a pyproject.toml configuration file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "python314-pytoolconfig-1.3.1-1.11.noarch.rpm"
RPM_HASH = "7652305110f750f2972e49fabd766b14817f47ac6de3b06f4a698d7a33bca0a0644a93650419a27f36aacba90d66e65ece9772aeb12b02309167700ab8e151ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytoolconfig \
python314-pytoolconfig \
python3dist-pytoolconfig"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
