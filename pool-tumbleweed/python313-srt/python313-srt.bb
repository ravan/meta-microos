SUMMARY = "Python library for handling SRT files, plus tools"
DESCRIPTION = "srt is a Python library for parsing, modifying, and composing SRT files. \
 \
It also includes related tools."
LICENSE = "MIT"

PV = "3.5.3"

RPM_NAME = "python313-srt-3.5.3-1.9.noarch.rpm"
RPM_HASH = "9a1547df48fe0cfe11a80e4a546c0339c08a4462cb1bf9e180ba5ef0fe69623614a632f1011f6d5d1c78f15b24c82ce6adccef6304d064d6f65bcf653be0a383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-srt \
python3.13dist-srt \
python313-srt \
python3dist-srt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
