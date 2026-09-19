SUMMARY = "Improvements over the standard pathlib module and pathlib2 package"
DESCRIPTION = "Improvements over the standard pathlib module and pathlib2 package."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python314-ruamel.std.pathlib-0.13.0-1.4.noarch.rpm"
RPM_HASH = "70eee3047e02e3bb4deca7c3558235c00ca7c8b5cc1c29f66ffe31921f7e25e34ee2b7ab05d88cacff658c6d5b102471a930b56be84ec4d50ca39e391066c072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ruamel.std.pathlib \
python314-ruamel.std.pathlib \
python3dist-ruamel.std.pathlib"

RDEPENDS:${PN} += "python-abi \
python314-orjson \
python314-ruamel.base"

inherit rpm
