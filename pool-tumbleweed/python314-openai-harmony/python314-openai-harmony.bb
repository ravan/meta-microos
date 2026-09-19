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

RPM_NAME = "python314-openai-harmony-0.0.8-1.3.aarch64.rpm"
RPM_HASH = "d97b21e6be61903a1a5e425cd2f54105e6754860368054c065696340bee5798df6d922eb7317bb67e96074d78750af12b1e2deedb35f94919f95ea3e1c694432"

RPROVIDES:${PN} += "python3.14dist-openai-harmony \
python314-openai-harmony \
python3dist-openai-harmony"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-pydantic"

inherit rpm
