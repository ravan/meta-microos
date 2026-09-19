SUMMARY = "Improvements over the standard pathlib module and pathlib2 package"
DESCRIPTION = "Improvements over the standard pathlib module and pathlib2 package."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python313-ruamel.std.pathlib-0.13.0-1.4.noarch.rpm"
RPM_HASH = "95c64efe0f531d76b9120e4c071b4b181407f433348dc75d135a405956b25fcfe4312a61763c8ccc00e7def21add58c3808fc29cb2ed2c4e5f08a9f085847429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.std.pathlib \
python3.13dist-ruamel.std.pathlib \
python313-ruamel.std.pathlib \
python3dist-ruamel.std.pathlib"

RDEPENDS:${PN} += "python-abi \
python313-orjson \
python313-ruamel.base"

inherit rpm
