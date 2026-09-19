SUMMARY = "HuggingFace community-driven open-source library of datasets"
DESCRIPTION = "HuggingFace community-driven open-source library of datasets. \
It provides one-line dataloaders for many public datasets and \
efficient data pre-processing for audio, vision and NLP tasks."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python313-datasets-5.0.1-1.1.noarch.rpm"
RPM_HASH = "57957710c90ef42e047b347e81c16ea8a0be55bdc8ef4474f9facd46094b59cef48606cb57ef9dbfbc3efde010630a5e1f998b4f91bb688bd8e5e730b16d22b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-datasets \
python3.13dist-datasets \
python313-datasets \
python3dist-datasets"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-aiohttp \
python313-dill \
python313-filelock \
python313-fsspec \
python313-httpx \
python313-huggingface-hub \
python313-multiprocess \
python313-numpy \
python313-packaging \
python313-pandas \
python313-pyarrow \
python313-requests \
python313-tqdm \
python313-xxhash"

inherit rpm
