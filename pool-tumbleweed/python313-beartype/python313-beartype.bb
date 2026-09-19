SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.22.9"

RPM_NAME = "python313-beartype-0.22.9-2.3.noarch.rpm"
RPM_HASH = "e7c9ba7798390b20383dac1bd4f8fd0a63a96de98d62204e6458d9e705dd18ebbfd2a82fd9562a6e5471c28637e812a9d7cb77b3a20873516c4d241657b6accf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-beartype \
python3.13dist-beartype \
python313-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm
