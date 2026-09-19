SUMMARY = "Read and write ML models in GGUF for GGML"
DESCRIPTION = "Python library for reading and writing ML models in the GGUF (GGML \
Universal File) format used by GGML-based inference engines such as \
llama.cpp. It also ships command-line tools to dump metadata, edit \
metadata values, copy a GGUF file with new metadata, and convert \
endianness."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python314-gguf-0.19.0-1.1.noarch.rpm"
RPM_HASH = "0ac94cb99c6397a31ee7c8ee5441caa3806decda835e35f056c4e2c41bc7e56758e5dfb7d001c112188cdda74da1d29bbd2f91e52288257e8bc07aa80850a401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gguf \
python314-gguf \
python3dist-gguf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-numpy \
python314-requests \
python314-tqdm"

inherit rpm
