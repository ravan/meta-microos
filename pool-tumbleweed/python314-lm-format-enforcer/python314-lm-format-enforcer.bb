SUMMARY = "Enforce the output format (JSON Schema, Regex etc) of a language model"
DESCRIPTION = "LM Format Enforcer is a library that enforces the output format (JSON \
Schema, regular expressions) of a language model by filtering the tokens \
that the model is allowed to generate at every timestep. It supports \
batched generation and beam search, and integrates with several inference \
backends such as Transformers, llama.cpp, vLLM and ExLlamaV2."
LICENSE = "MIT"

PV = "0.11.3"

RPM_NAME = "python314-lm-format-enforcer-0.11.3-1.1.noarch.rpm"
RPM_HASH = "63ddbdc71b41314b6baec89df5da345f81c243227011e234cc9b6d11a4991b362b35f04fbf7fd1a492cfb1b0e5e4e9d78fec68563d0f21b0048b47292430858f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lm-format-enforcer \
python314-lm-format-enforcer \
python3dist-lm-format-enforcer"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-interegular \
python314-packaging \
python314-pydantic"

inherit rpm
