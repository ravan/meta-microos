SUMMARY = "Library of common utilities for Mistral AI"
DESCRIPTION = "mistral-common is a library of common utilities for Mistral AI models. It \
provides the tokenizers (SentencePiece and Tekken), request/response \
protocol data models, and validation helpers used to build prompts and \
parse completions for Mistral models. This build enables the image extra \
so multimodal image inputs can be processed."
LICENSE = "Apache-2.0"

PV = "1.11.7"

RPM_NAME = "python313-mistral-common-1.11.7-1.1.noarch.rpm"
RPM_HASH = "ab8dae93a324dfb6458a7011223b6f75cb2c2d4d5d9b3361a5439495f2866c47827f59e5258932e8f7fa3af45707e6fa9251199e1aab8dffd6d04174b8b5ce29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistral-common \
python3.13dist-mistral-common \
python313-mistral-common \
python3dist-mistral-common"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pillow \
python313-jsonschema \
python313-numpy \
python313-opencv \
python313-pydantic \
python313-pydantic-extra-types \
python313-requests \
python313-tiktoken \
python313-typing-extensions \
update-alternatives"

inherit rpm
