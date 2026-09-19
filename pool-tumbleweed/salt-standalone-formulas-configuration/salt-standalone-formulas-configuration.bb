SUMMARY = "Standalone Salt configuration to make the packaged formulas available for the Salt master"
DESCRIPTION = "This package adds the standalone configuration for the Salt master in order to make the packaged Salt formulas available on the Salt master"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-standalone-formulas-configuration-3006.0-70.1.aarch64.rpm"
RPM_HASH = "abe47246f908a8a1fa576ee49c3da99d61f39bc8fa53f8d40d3943624a739e1fd4b8e25e540cbd43b047b864d6ab2c398f868bb1bece459c8ecd6f9beb31ffa9"

RPROVIDES:${PN} += "config-salt-standalone-formulas-configuration \
salt-formulas-configuration \
salt-standalone-formulas-configuration"

RDEPENDS:${PN} += "group-salt \
salt"

inherit rpm
