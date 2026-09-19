SUMMARY = "JavaScript unobfuscator and beautifier"
DESCRIPTION = "Beautify, unpack or deobfuscate JavaScript. Handles popular online obfuscators."
LICENSE = "MIT"

PV = "1.15.4"

RPM_NAME = "python314-jsbeautifier-1.15.4-1.4.noarch.rpm"
RPM_HASH = "a0b81ee88df80d3ab35f47f7dd7bdf741c0749c943f5708767673f2829c8ddcf0e12a25e9981bee11caf59d2fd912867063b946b459f5230c577f65278affd29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsbeautifier \
python314-jsbeautifier \
python3dist-jsbeautifier"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-EditorConfig \
python314-six \
update-alternatives"

inherit rpm
