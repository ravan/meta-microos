SUMMARY = "Parse and create Python distribution metadata"
DESCRIPTION = "Parse and create Python distribution metadata."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-dist-meta-0.9.0-1.3.noarch.rpm"
RPM_HASH = "65e4884312deaf8631ab5d42033814fc2793e51de20decaaf67f63af728eecc9a0b698fdab4ef2b46885baa9781aebfb56b0f4cced88abaefc0b269527cb2a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dist-meta \
python3.13dist-dist-meta \
python313-dist-meta \
python3dist-dist-meta"

RDEPENDS:${PN} += "python-abi \
python313-domdf-python-tools \
python313-handy-archives \
python313-packaging"

inherit rpm
