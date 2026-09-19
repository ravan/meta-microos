SUMMARY = "Minimal CLI coding agent by Mistral"
DESCRIPTION = "Mistral Vibe is a command-line coding assistant powered by Mistral's \
models. It provides a conversational interface to your codebase, \
allowing you to use natural language to explore, modify, and interact \
with your projects through a powerful set of tools."
LICENSE = "Apache-2.0"

PV = "2.25.4"

RPM_NAME = "mistral-vibe-2.25.4-1.1.noarch.rpm"
RPM_HASH = "ad8bd436b9bb80b121700c99d327bef4f8f2399129b8bd68cf2b0324abb58db0cfe8ebc4d98fded98ada4bb50872132268c89d92612dffa29b014f8d6c194422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mistral-vibe \
python3.13dist-mistral-vibe \
python312-mistral-vibe \
python313-mistral-vibe \
python314-mistral-vibe \
python3dist-mistral-vibe"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-GitPython \
python3-PyJWT \
python3-PyYAML \
python3-SecretStorage \
python3-agent-client-protocol \
python3-annotated-types \
python3-anyio \
python3-attrs \
python3-beautifulsoup4 \
python3-cachetools \
python3-certifi \
python3-cffi \
python3-charset-normalizer \
python3-click \
python3-cryptography \
python3-eval-type-backport \
python3-gitdb \
python3-giturlparse \
python3-google-auth \
python3-googleapis-common-protos \
python3-h11 \
python3-httpcore \
python3-httpx \
python3-httpx-sse \
python3-humanize \
python3-idna \
python3-importlib-metadata \
python3-jaraco.classes \
python3-jaraco.context \
python3-jaraco.functools \
python3-jeepney \
python3-jsonpatch \
python3-jsonpath-python \
python3-jsonpointer \
python3-jsonschema \
python3-jsonschema-specifications \
python3-keyring \
python3-linkify-it-py \
python3-markdown-it-py \
python3-markdownify \
python3-mcp \
python3-mdit-py-plugins \
python3-mdurl \
python3-mistralai \
python3-more-itertools \
python3-opentelemetry-api \
python3-opentelemetry-exporter-otlp-proto-common \
python3-opentelemetry-exporter-otlp-proto-http \
python3-opentelemetry-proto \
python3-opentelemetry-sdk \
python3-opentelemetry-semantic-conventions \
python3-packaging \
python3-pexpect \
python3-platformdirs \
python3-protobuf \
python3-ptyprocess \
python3-pyasn1 \
python3-pyasn1-modules \
python3-pycparser \
python3-pydantic \
python3-pydantic-core \
python3-pydantic-settings \
python3-pygments \
python3-pyperclip \
python3-python-dateutil \
python3-python-dotenv \
python3-python-multipart \
python3-referencing \
python3-requests \
python3-rfc8785 \
python3-rich \
python3-rpds-py \
python3-sentry-sdk \
python3-setproctitle \
python3-six \
python3-smmap \
python3-sounddevice \
python3-soupsieve \
python3-sse-starlette \
python3-starlette \
python3-textual \
python3-textual-speedups \
python3-tomli-w \
python3-tree-sitter \
python3-tree-sitter-bash \
python3-truststore \
python3-typing-extensions \
python3-typing-inspection \
python3-uc-micro-py \
python3-urllib3 \
python3-uvicorn \
python3-watchfiles \
python3-websockets \
python3-zipp \
python3-zstandard \
tree-sitter-bash"

inherit rpm
