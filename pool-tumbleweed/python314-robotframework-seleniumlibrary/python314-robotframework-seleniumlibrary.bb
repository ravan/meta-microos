SUMMARY = "Web testing library for Robot Framework"
DESCRIPTION = "Web testing library for Robot Framework"
LICENSE = "Apache-2.0"

PV = "6.9.0"

RPM_NAME = "python314-robotframework-seleniumlibrary-6.9.0-1.2.noarch.rpm"
RPM_HASH = "28cbd6cf2456db6dee675d73590412104e824c38c38e72e21665d427a4e24c67ba14430fe9b98221cad22413f33a51cc13997a559f31346630085d65b0b1868c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-robotframework-seleniumlibrary \
python314-robotframework-seleniumlibrary \
python3dist-robotframework-seleniumlibrary"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-robotframework \
python314-robotframework-pythonlibcore \
python314-selenium \
update-alternatives"

inherit rpm
