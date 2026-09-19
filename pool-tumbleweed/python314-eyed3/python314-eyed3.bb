SUMMARY = "Component library of eyeD3, an ID3 tag manipulation tool"
DESCRIPTION = "eyeD3 is a Python tool for working with audio files, specifically MP3 \
files containing ID3 metadata (i.e. song info)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "0.9.9"

RPM_NAME = "python314-eyed3-0.9.9-1.4.noarch.rpm"
RPM_HASH = "bd7f1e01dae624e4c731b4ab917d7ea2d8894b8fcfba7777753cae4b59c5700d78d90047f56e10b158918fd5aaf391538ade60faba7ccbbfe86e1b99b5707303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-eyed3 \
python314-eyed3 \
python3dist-eyed3"

RDEPENDS:${PN} += "python-abi \
python314-deprecation \
python314-filetype"

inherit rpm
