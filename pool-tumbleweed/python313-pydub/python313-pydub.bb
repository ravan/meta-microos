SUMMARY = "Audio manipulation with Python"
DESCRIPTION = "A Python module to manipulate audio with a high level interface."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python313-pydub-0.25.1-7.8.noarch.rpm"
RPM_HASH = "f8e998a08b318049eee3d6f61fdb17007cc52ee582e1d026eed9680ab1e3a2d9b14309166284c5649cc90e3a033613897315763b8c0ceba984297b129f02474a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydub \
python3.13dist-pydub \
python313-pydub \
python3dist-pydub"

RDEPENDS:${PN} += "ffmpeg-8 \
python-abi \
python313-audioop-lts"

inherit rpm
