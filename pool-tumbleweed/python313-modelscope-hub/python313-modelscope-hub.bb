SUMMARY = "Official Python client for ModelScope Hub"
DESCRIPTION = "Python SDK and CLI to download, upload and manage models, datasets, \
Studio spaces, skills and MCP servers on ModelScope Hub. Provides a \
HubApi class and the modelscope, ms, modelscope-hub and ms-hub \
commands."
LICENSE = "Apache-2.0"

PV = "0.4.2"

RPM_NAME = "python313-modelscope-hub-0.4.2-1.1.noarch.rpm"
RPM_HASH = "ae416af7bab54f4ae3af130dcb6e0f49281e186af1ed9d0c40aade5af68849fc021c6a1971f394df48b3e86bcda15a63e53725599cba73e3380f9bc3053f2a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-modelscope-hub \
python3.13dist-modelscope-hub \
python313-modelscope-hub \
python3dist-modelscope-hub"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-cryptography \
python313-filelock \
python313-requests \
python313-tqdm \
python313-urllib3"

inherit rpm
