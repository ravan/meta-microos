SUMMARY = "Python library for reading/writing TMX tile files"
DESCRIPTION = "This library reads and writes the Tiled TMX format. \
This is useful for map editors or generic level editors like \
Tiled to edit a game's levels."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python314-tmx-1.10-4.5.noarch.rpm"
RPM_HASH = "400211248f1124c58fb6e5f9b8e202f0a3087bd0fb444d6cd3c3fcabdd495f78964d7046d35bd3e4ecdb24d5a3f1d9fbf05270b1cf8c450a59c8f9891653eac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tmx \
python314-tmx \
python3dist-tmx"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
