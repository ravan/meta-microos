SUMMARY = "Audio manipulation with Python"
DESCRIPTION = "A Python module to manipulate audio with a high level interface."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "python314-pydub-0.25.1-7.8.noarch.rpm"
RPM_HASH = "42f3e0c9947e2c1de04b86bd0e197f0fb28cd308efb49ba03016dfca3e78f2a852ae37a3d2f195883c9da03598403e3f87e88c80d66099c801fa2df1e696bbc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydub \
python314-pydub \
python3dist-pydub"

RDEPENDS:${PN} += "ffmpeg-8 \
python-abi \
python314-audioop-lts"

inherit rpm
