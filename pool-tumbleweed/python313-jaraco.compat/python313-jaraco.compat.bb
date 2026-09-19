SUMMARY = "Modules providing forward compatibility across Python versions"
DESCRIPTION = "Modules providing forward compatibility across Python versions"
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python313-jaraco.compat-4.3.1-1.4.noarch.rpm"
RPM_HASH = "7d10e242bf7628dd97862c0658678e6fa16ff67316c69473487fb0d488d7fb531016f52c011907bd113ace536cf181d54d47f8abd9a8513f71e99b34454f0332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.compat \
python3.13dist-jaraco.compat \
python313-jaraco.compat \
python3dist-jaraco.compat"

RDEPENDS:${PN} += "python-abi"

inherit rpm
