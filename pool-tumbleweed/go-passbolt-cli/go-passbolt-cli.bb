SUMMARY = "A CLI tool to interact with Passbolt"
DESCRIPTION = "This package provides a CLI tool to interact with Passbolt, An Open Source Password Manager for Teams \
 \
Passbolt Website: https://www.passbolt.com/ \
 \
This project is community driven and not associated with Passbolt SA"
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "go-passbolt-cli-0.5.1-1.2.aarch64.rpm"
RPM_HASH = "3471e4585f4a5448d08646d7422211172ff9487d3dba74c002e3a27f3a33a1ab16e7eeeac181e3a2c8977f0038052c45214e580d8e487bda377d6ae32ef07c8c"

RPROVIDES:${PN} += "go-passbolt-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
