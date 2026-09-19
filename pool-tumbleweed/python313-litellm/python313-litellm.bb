SUMMARY = "Library to easily interface with LLM API providers"
DESCRIPTION = "LiteLLM manages: \
 \
- Translate inputs to provider's `completion`, `embedding`, and `image_generation` endpoints \
- [Consistent output](https://docs.litellm.ai/docs/completion/output), text responses will always be available at `['choices'][0]['message']['content']` \
- Retry/fallback logic across multiple deployments (e.g. Azure/OpenAI) - [Router](https://docs.litellm.ai/docs/routing) \
- Set Budgets & Rate limits per project, api key, model [LiteLLM Proxy Server (LLM Gateway)](https://docs.litellm.ai/docs/simple_proxy)"
LICENSE = "MIT"

PV = "1.89.1"

RPM_NAME = "python313-litellm-1.89.1-1.2.noarch.rpm"
RPM_HASH = "8c253558e4361e53091163fe8d44fa50349b58783e6967d121fa682ca9ee85ca60bbf1d84e64bfd77f7e44a76f500f7c4d9d3ef923b20d74a6e41cd487e39767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-litellm \
python3.13dist-litellm \
python313-litellm \
python3dist-litellm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-aiohttp \
python313-click \
python313-fastuuid \
python313-httpx \
python313-importlib-metadata \
python313-jinja2 \
python313-jsonschema \
python313-openai \
python313-pydantic \
python313-python-dotenv \
python313-tiktoken \
python313-tokenizers"

inherit rpm
