SUMMARY = "Read and write audio files tags in Python"
DESCRIPTION = "Handles low-level interfacing for files' tags. Wraps Mutagen to"
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python314-mediafile-0.17.0-2.1.noarch.rpm"
RPM_HASH = "4be5ea1a1580eb18ed8ffc268bac9d6af13116ed32bf7beced0e7ddbbd0188b04e1ee4bfc5ad01dd4bef2bf392280e437107a0a075b47ce6eba7df877df60841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mediafile \
python314-mediafile \
python3dist-mediafile"

RDEPENDS:${PN} += "python-abi \
python314-filetype \
python314-mutagen"

inherit rpm
