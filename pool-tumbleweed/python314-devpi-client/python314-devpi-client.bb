SUMMARY = "Client for devpi"
DESCRIPTION = "devpi-client is a command line tool with sub commands for creating users, using \
indexes, uploading to and installing from indexes, as well as a 'test' command \
for invoking tox."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "python314-devpi-client-7.3.0-1.2.noarch.rpm"
RPM_HASH = "03fdc85474b11e822003838efb6fb3c1eff770e9fe58b7f3b4bf9b9c8ea752b553a48b61ccd2e4495fb171396ede41e74a8d0bfb7ed0e43686ddd091c05edd88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-devpi-client \
python314-devpi-client \
python3dist-devpi-client"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-build \
python314-check-manifest \
python314-devpi-common \
python314-iniconfig \
python314-pkginfo \
python314-platformdirs \
python314-pluggy \
python314-requests \
python314-tox \
python314-virtualenv \
update-alternatives"

inherit rpm
