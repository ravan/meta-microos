SUMMARY = "Tool for running AI models on-premise"
DESCRIPTION = "Ollama is a tool for running AI models on one's own hardware. \
It offers a command-line interface and a RESTful API. \
New models can be created or existing ones modified in the \
Ollama library using the Modelfile syntax. \
Source model weights found on Hugging Face and similar sites \
can be imported."
LICENSE = "MIT"

PV = "0.33.1"

RPM_NAME = "ollama-0.33.1-1.1.aarch64.rpm"
RPM_HASH = "075d3b70773e327286fda5bf75440bfd78154812698db3ab5899e6df8202d750a9f2726393277b99f3d4e99fff9bd4a13a37f5ce4dc372877e6359f06410b133"

RPROVIDES:${PN} += "group-ollama \
libggml-base.so.0 \
libggml-cpu-armv8.0-1.so \
libggml-cpu-armv8.2-1.so \
libggml-cpu-armv8.2-2.so \
libggml-cpu-armv8.2-3.so \
libggml-cpu-armv8.6-1.so \
libggml-cpu-armv8.6-2.so \
libggml-cpu-armv9.2-1.so \
libggml-cpu-armv9.2-2.so \
libggml.so.0 \
libllama-common.so.0 \
libllama-quantize-impl.so \
libllama-server-impl.so \
libllama.so.0 \
libmtmd.so.0 \
ollama \
user-ollama"

RDEPENDS:${PN} += "/usr/bin/sh \
group-render \
group-video \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
sysuser-shadow"

inherit rpm
