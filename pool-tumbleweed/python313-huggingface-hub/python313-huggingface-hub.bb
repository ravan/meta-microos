SUMMARY = "Client library for interaction with the huggingface hub"
DESCRIPTION = "Client library to download and publish models, datasets and other repos on the huggingface.co hub"
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python313-huggingface-hub-1.31.0-1.1.noarch.rpm"
RPM_HASH = "1e414a197caf6a005ba548590f34218ef673acd0fb11696fc58b333cb6b39a176e34145a75baf7f0000f357bdda6b2baa5c61cf8beea409044cb98304b48362f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-huggingface-hub \
python3.13dist-huggingface-hub \
python313-huggingface-hub \
python3dist-huggingface-hub"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-click \
python313-filelock \
python313-fsspec \
python313-httpx \
python313-packaging \
python313-tqdm \
python313-typing-extensions"

inherit rpm
