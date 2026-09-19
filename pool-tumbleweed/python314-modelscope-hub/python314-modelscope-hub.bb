SUMMARY = "Official Python client for ModelScope Hub"
DESCRIPTION = "Python SDK and CLI to download, upload and manage models, datasets, \
Studio spaces, skills and MCP servers on ModelScope Hub. Provides a \
HubApi class and the modelscope, ms, modelscope-hub and ms-hub \
commands."
LICENSE = "Apache-2.0"

PV = "0.4.2"

RPM_NAME = "python314-modelscope-hub-0.4.2-1.1.noarch.rpm"
RPM_HASH = "fe44a474a79d66c2d39ef5be8afca3ab34f3ddbdaa50bdbb731ac8e7e121eca5c99cf0cf1a8c22894ee62587d05eb81018576d7ea9bdc00fdafcceca7eeab2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-modelscope-hub \
python314-modelscope-hub \
python3dist-modelscope-hub"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-cryptography \
python314-filelock \
python314-requests \
python314-tqdm \
python314-urllib3"

inherit rpm
