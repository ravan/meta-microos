SUMMARY = "Client for devpi"
DESCRIPTION = "devpi-client is a command line tool with sub commands for creating users, using \
indexes, uploading to and installing from indexes, as well as a 'test' command \
for invoking tox."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "python313-devpi-client-7.3.0-1.2.noarch.rpm"
RPM_HASH = "31e5445db5c682b36767eca0526b984ea9966836fe9a62a25f51254983b35ca17d98f8c10c1f26b64bd56dca90311d52574d25d60e81cdc461318a19ccfce7a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-client \
python3.13dist-devpi-client \
python313-devpi-client \
python3dist-devpi-client"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-build \
python313-check-manifest \
python313-devpi-common \
python313-iniconfig \
python313-pkginfo \
python313-platformdirs \
python313-pluggy \
python313-requests \
python313-tox \
python313-virtualenv \
update-alternatives"

inherit rpm
