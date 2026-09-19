SUMMARY = "Component library of eyeD3, an ID3 tag manipulation tool"
DESCRIPTION = "eyeD3 is a Python tool for working with audio files, specifically MP3 \
files containing ID3 metadata (i.e. song info)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "0.9.9"

RPM_NAME = "python313-eyed3-0.9.9-1.4.noarch.rpm"
RPM_HASH = "7fe37952a805cd735c6d7c4a18314b8890d4041ed8591b64e1e802c3329e9d47eba2d7463a33d0720c190f2c8c521707f565dbf5e4430c8d1514ffc29dbc518d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eyed3 \
python3.13dist-eyed3 \
python313-eyed3 \
python3dist-eyed3"

RDEPENDS:${PN} += "python-abi \
python313-deprecation \
python313-filetype"

inherit rpm
