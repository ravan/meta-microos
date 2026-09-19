SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python310-environ-config-22.1.0-1.1.noarch.rpm"
RPM_HASH = "c64c15ba137c4814bd9e57503475bd2266958effa73fcc9f547666cb6f42d2f362a6ba0c45832772e950303c12b75baffe4c85b008fb0336481a45190dc6e7b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-environ-config \
python3.10dist-environ-config \
python310-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
