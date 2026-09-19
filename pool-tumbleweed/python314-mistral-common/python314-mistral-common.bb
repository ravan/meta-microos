SUMMARY = "Library of common utilities for Mistral AI"
DESCRIPTION = "mistral-common is a library of common utilities for Mistral AI models. It \
provides the tokenizers (SentencePiece and Tekken), request/response \
protocol data models, and validation helpers used to build prompts and \
parse completions for Mistral models. This build enables the image extra \
so multimodal image inputs can be processed."
LICENSE = "Apache-2.0"

PV = "1.11.7"

RPM_NAME = "python314-mistral-common-1.11.7-1.1.noarch.rpm"
RPM_HASH = "e462ad45a36eaa6de9767cd371f2a27a552d969a1807d42bda0ea6013432ddd1497289562feb96da8a0c3a96df6fd31b30f3dea220310f4264423fa33c1fc290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mistral-common \
python314-mistral-common \
python3dist-mistral-common"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pillow \
python314-jsonschema \
python314-numpy \
python314-opencv \
python314-pydantic \
python314-pydantic-extra-types \
python314-requests \
python314-tiktoken \
python314-typing-extensions \
update-alternatives"

inherit rpm
