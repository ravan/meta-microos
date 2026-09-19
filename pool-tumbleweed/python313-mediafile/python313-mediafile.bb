SUMMARY = "Read and write audio files tags in Python"
DESCRIPTION = "Handles low-level interfacing for files' tags. Wraps Mutagen to"
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python313-mediafile-0.17.0-2.1.noarch.rpm"
RPM_HASH = "e15d590e4e5fcde750708fbe1a6eb8226a3a230fd9252a67d5f45d0a496a0f1971c1188799b9a4d8336b65e26a2c85c6d99fa768b9ec34bb23a3fd7e365a25f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mediafile \
python3.13dist-mediafile \
python313-mediafile \
python3dist-mediafile"

RDEPENDS:${PN} += "python-abi \
python313-filetype \
python313-mutagen"

inherit rpm
