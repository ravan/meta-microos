SUMMARY = "Programmatic API to create and use a devpi server process"
DESCRIPTION = "This package provides a programmatic API to create and use a \
devpi server process."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-devpi-process-1.2.0-1.1.noarch.rpm"
RPM_HASH = "71b8cae7437be0a17592e62c5e6ccb90c4caeed63aa0b69a20bbcfb6fb0781ae5904f46ae45125ae0cea909d59ad95864a0b80e370a11ab4f04c8a39be1ef3ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-devpi-process \
python3.13dist-devpi-process \
python313-devpi-process \
python3dist-devpi-process"

RDEPENDS:${PN} += "python-abi \
python313-devpi-client \
python313-devpi-server"

inherit rpm
