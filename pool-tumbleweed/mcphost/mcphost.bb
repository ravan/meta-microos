SUMMARY = "A CLI host application for the Model Context Protocol (MCP)"
DESCRIPTION = "A CLI host application that enables Large Language Models (LLMs) to interact \
with external tools through the Model Context Protocol (MCP). Currently \
supports both Claude 3.5 Sonnet and Ollama models."
LICENSE = "MIT & Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.34.0"

RPM_NAME = "mcphost-0.34.0-10.1.aarch64.rpm"
RPM_HASH = "a340d22fae2332cf2614c555e84d9813fc65704e2a5550a16f2029a2c868eba56895cfdfcec63cc7c6e441c60b8583cbdcb85a5f427e43c9f600a18333978f8c"

RPROVIDES:${PN} += "mcphost"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
