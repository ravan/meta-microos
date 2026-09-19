SUMMARY = "Localhost-only version of NPM registry"
DESCRIPTION = "localhost-only npm registry serves NPM packages on localhost \
address allowing running of 'npm install' in a non-networked \
environment"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "local-npm-registry-1.1.0-2.5.noarch.rpm"
RPM_HASH = "fb67297e8e1f0cbcc5d0ef395e880895000694602058c3e11d81e9ff440271ead38b53288e551ddd8bc9fab2e99af2694e909fb652b327c312c50031a2c6c3fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "local-npm-registry"

RDEPENDS:${PN} += "npm-default"

inherit rpm
