SUMMARY = "HuggingFace community-driven open-source library of datasets"
DESCRIPTION = "HuggingFace community-driven open-source library of datasets. \
It provides one-line dataloaders for many public datasets and \
efficient data pre-processing for audio, vision and NLP tasks."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python314-datasets-5.0.1-1.1.noarch.rpm"
RPM_HASH = "bcd3dc4c99e70b309f5a16979350869048b89a0250c2bdf9ec12df3d90a43badddce732019aba2c5d0a77737711ed16e4b66ce01863d602b4955698f256b0977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-datasets \
python314-datasets \
python3dist-datasets"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-aiohttp \
python314-dill \
python314-filelock \
python314-fsspec \
python314-httpx \
python314-huggingface-hub \
python314-multiprocess \
python314-numpy \
python314-packaging \
python314-pandas \
python314-pyarrow \
python314-requests \
python314-tqdm \
python314-xxhash"

inherit rpm
