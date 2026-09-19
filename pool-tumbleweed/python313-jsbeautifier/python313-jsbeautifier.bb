SUMMARY = "JavaScript unobfuscator and beautifier"
DESCRIPTION = "Beautify, unpack or deobfuscate JavaScript. Handles popular online obfuscators."
LICENSE = "MIT"

PV = "1.15.4"

RPM_NAME = "python313-jsbeautifier-1.15.4-1.4.noarch.rpm"
RPM_HASH = "911d9c2cebb9c32d823faa6f687724edae88c1098d26207672f87262da85417481af71e57e44032bd7d3e514f57ee113f8a4642d3e5834c027243c14a10f569c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsbeautifier \
python3.13dist-jsbeautifier \
python313-jsbeautifier \
python3dist-jsbeautifier"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-EditorConfig \
python313-six \
update-alternatives"

inherit rpm
