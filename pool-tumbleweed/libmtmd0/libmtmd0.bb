SUMMARY = "Library to run multimodals inference models"
DESCRIPTION = "As outlined in the history, libmtmd is the modern library designed to \
replace the original llava.cpp implementation for handling multimodal inputs. \
 \
Built upon clip.cpp (similar to llava.cpp), libmtmd offers several advantages: \
- Unified Interface: Aims to consolidate interaction for various multimodal models. \
- Improved UX/DX: Features a more intuitive API, inspired by the Processor class \
  in the Hugging Face transformers library. \
- Flexibility: Designed to support multiple input types (text, audio, images) while \
  respecting the wide variety of chat templates used by different models."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libmtmd0-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "370a06e77952475bedfed0a71dd88b932ebd99386ca10f3983ddd8a5051121ccf7bc0455878f9e58fb0fea801a1ec1b1b3f39fb29cd0bb524b24318242cb2b50"

RPROVIDES:${PN} += "libmtmd.so.0 \
libmtmd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libggml-base.so.0 \
libggml.so.0 \
libllama.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
