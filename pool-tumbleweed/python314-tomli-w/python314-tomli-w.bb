SUMMARY = "A lil' TOML writer"
DESCRIPTION = "Tomli-W is a Python library for writing TOML. It is a write-only counterpart to Tomli, \
which is a read-only TOML parser."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-tomli-w-1.2.0-1.7.noarch.rpm"
RPM_HASH = "04bf2c7911a4d6da3e92b57d83d2a6710e25401fccaff335e7d428a31988b576a2cbc8d1adfb3c5d03a335a4cb4aea09385f90e494a873041b0306ed811edb00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tomli-w \
python314-tomli-w \
python3dist-tomli-w"

RDEPENDS:${PN} += "python-abi"

inherit rpm
