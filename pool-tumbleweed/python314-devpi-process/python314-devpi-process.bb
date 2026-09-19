SUMMARY = "Programmatic API to create and use a devpi server process"
DESCRIPTION = "This package provides a programmatic API to create and use a \
devpi server process."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-devpi-process-1.2.0-1.1.noarch.rpm"
RPM_HASH = "4e1a508c52eb2500c658dcc2d46fc44e52a4c2495b7b69f03c7bf41c05d2e477ef31520da485226a50b8a80f39f9c0806805755751fba24496b257e231bb1a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-devpi-process \
python314-devpi-process \
python3dist-devpi-process"

RDEPENDS:${PN} += "python-abi \
python314-devpi-client \
python314-devpi-server"

inherit rpm
