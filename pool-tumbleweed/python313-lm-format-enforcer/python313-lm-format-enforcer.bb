SUMMARY = "Enforce the output format (JSON Schema, Regex etc) of a language model"
DESCRIPTION = "LM Format Enforcer is a library that enforces the output format (JSON \
Schema, regular expressions) of a language model by filtering the tokens \
that the model is allowed to generate at every timestep. It supports \
batched generation and beam search, and integrates with several inference \
backends such as Transformers, llama.cpp, vLLM and ExLlamaV2."
LICENSE = "MIT"

PV = "0.11.3"

RPM_NAME = "python313-lm-format-enforcer-0.11.3-1.1.noarch.rpm"
RPM_HASH = "e3543df92b656b394cf5d9bec3aa3edc4ae4972ab9edc093e69fbce41f2210a7d9ea534b145a7573423d97efef18bd253eba752c332278b3ce8fcdf4bcb921fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lm-format-enforcer \
python3.13dist-lm-format-enforcer \
python313-lm-format-enforcer \
python3dist-lm-format-enforcer"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-interegular \
python313-packaging \
python313-pydantic"

inherit rpm
