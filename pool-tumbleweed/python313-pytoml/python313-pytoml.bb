SUMMARY = "TOML-0.4.0 parser/writer for Python"
DESCRIPTION = "A specs-conforming and strict parser and writer for TOML files. \
The library currently supports version 0.4.0 of the specs. \
 \
The pytoml project is no longer being actively maintained. \
Consider using the toml package instead."
LICENSE = "MIT"

PV = "0.1.21"

RPM_NAME = "python313-pytoml-0.1.21-4.5.noarch.rpm"
RPM_HASH = "53976a680aaf07318ca1963569d9ae0826673c73016e65dc4a5aad5f544d31cd9b5ada0515ae7a887cbcee254c46cac560524894bc0922f9b193ce45c7baf286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoml \
python3.13dist-pytoml \
python313-pytoml \
python3dist-pytoml"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
