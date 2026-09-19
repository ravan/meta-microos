SUMMARY = "Read and write ML models in GGUF for GGML"
DESCRIPTION = "Python library for reading and writing ML models in the GGUF (GGML \
Universal File) format used by GGML-based inference engines such as \
llama.cpp. It also ships command-line tools to dump metadata, edit \
metadata values, copy a GGUF file with new metadata, and convert \
endianness."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python313-gguf-0.19.0-1.1.noarch.rpm"
RPM_HASH = "e27959bc21874931ee410fdaa4891fcffe3a9c08c9b5713ce8e91430feff8b1481f53322072c81c6bc3328b9f75bcffff82f85e2cf0ab0cc17b866724a3ea33e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gguf \
python3.13dist-gguf \
python313-gguf \
python3dist-gguf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-numpy \
python313-requests \
python313-tqdm"

inherit rpm
