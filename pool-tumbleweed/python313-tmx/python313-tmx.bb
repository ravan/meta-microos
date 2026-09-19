SUMMARY = "Python library for reading/writing TMX tile files"
DESCRIPTION = "This library reads and writes the Tiled TMX format. \
This is useful for map editors or generic level editors like \
Tiled to edit a game's levels."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python313-tmx-1.10-4.5.noarch.rpm"
RPM_HASH = "ea3dc9256bafd9cd3804d7e3abb18b849efb845f64d7ff240053aa1f7c9c7070f4ed536b86abad98dfcdbae9ba9963b345a6b5029938cec20a81b4eed0d71073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tmx \
python3.13dist-tmx \
python313-tmx \
python3dist-tmx"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
