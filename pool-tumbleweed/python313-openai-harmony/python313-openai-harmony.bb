SUMMARY = "Renderer for the OpenAI harmony response format"
DESCRIPTION = "Harmony is the response format used by OpenAI's open-weight gpt-oss model \
series. It structures conversations into typed messages, roles and channels \
and provides the tokenizer encodings the models expect. \
 \
This package provides the Python bindings, a thin typed convenience layer \
backed by a compiled Rust extension, for rendering and parsing harmony \
formatted conversations."
LICENSE = "Apache-2.0"

PV = "0.0.8"

RPM_NAME = "python313-openai-harmony-0.0.8-1.3.aarch64.rpm"
RPM_HASH = "adb539ef6467cc89f7e71c9a6e826da10413abb4fc9191c394804a3870e78ace5909149dc64e0cfdf9b05c85b247b90a18ce646fec2fa77b623dafb68cb96e72"

RPROVIDES:${PN} += "python3-openai-harmony \
python3.13dist-openai-harmony \
python313-openai-harmony \
python3dist-openai-harmony"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-pydantic"

inherit rpm
