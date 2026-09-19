SUMMARY = "Context optimization layer for LLM applications"
DESCRIPTION = "Headroom is a context-optimization layer for LLM applications. It compresses \
tool output and conversation context so requests use fewer tokens, and ships \
a command-line interface plus a compiled pyo3 extension (headroom._core). \
 \
This package is the core CLI. The optional [proxy] extra lives in the \
headroom-proxy subpackage; without it, 'headroom proxy' / 'headroom wrap' \
exit because ensure_proxy_dependencies() hard-imports that set. Code-aware \
slicing shells out to the distro ast-grep binary rather than the \
ast-grep-cli PyPI wheel."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "0.37.0"

RPM_NAME = "headroom-0.37.0-1.1.aarch64.rpm"
RPM_HASH = "381b40d9be16d2dbd6699deac6d7055edf2c72468af8abdd5490cb6323fd84cbb09d64ebc0beb0c4df9dcb32dc81ed43060ba480864bacbd862422513fe189fe"

RPROVIDES:${PN} += "headroom \
python3.13dist-headroom-ai \
python3dist-headroom-ai"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ast-grep \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python313-PyYAML \
python313-click \
python313-litellm \
python313-opentelemetry-api \
python313-pydantic \
python313-rich \
python313-tiktoken \
python313-tomlkit"

inherit rpm
