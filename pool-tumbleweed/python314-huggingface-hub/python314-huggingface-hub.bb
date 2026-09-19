SUMMARY = "Client library for interaction with the huggingface hub"
DESCRIPTION = "Client library to download and publish models, datasets and other repos on the huggingface.co hub"
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python314-huggingface-hub-1.31.0-1.1.noarch.rpm"
RPM_HASH = "0c17ba45f73695275e18ff83a63a980e20740388f67e9a5181f33333b6dc30491f53fe464adee9a93503c342eef29cfc19a6fad8007e2ed986fc3fe67b0f9ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-huggingface-hub \
python314-huggingface-hub \
python3dist-huggingface-hub"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-click \
python314-filelock \
python314-fsspec \
python314-httpx \
python314-packaging \
python314-tqdm \
python314-typing-extensions"

inherit rpm
