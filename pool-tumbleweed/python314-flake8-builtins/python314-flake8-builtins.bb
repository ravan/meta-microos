SUMMARY = "Flake8 Builtins plugin"
DESCRIPTION = "This plugin checks for Python builtins being used as variables or parameters."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "python314-flake8-builtins-3.1.0-1.4.noarch.rpm"
RPM_HASH = "c97b16654bf9c90616f2c42139965724749fba75ff92d7a0f2cc88e397bd9a6cd97195cb86627e6c2d6da96f6ba24f41adba5fb8fe2e6d6f01bf79887dfdade0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-builtins \
python314-flake8-builtins \
python3dist-flake8-builtins"

RDEPENDS:${PN} += "python-abi \
python314-flake8"

inherit rpm
