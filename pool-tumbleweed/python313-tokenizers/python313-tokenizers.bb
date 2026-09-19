SUMMARY = "Provides an implementation of today's most used tokenizers"
DESCRIPTION = "Provides an implementation of today's most used tokenizers, with a focus on \
performance and versatility. \
* Train new vocabularies and tokenize, using today's most used tokenizers. \
* Extremely fast (both training and tokenization), thanks to the Rust \
  implementation. Takes less than 20 seconds to tokenize a GB of text on a \
  server's CPU. \
* Easy to use, but also extremely versatile. \
* Designed for research and production. \
* Normalization comes with alignments tracking. It's always possible to get the \
  part of the original sentence that corresponds to a given token. \
* Does all the pre-processing: Truncate, Pad, add the special tokens your model \
  needs."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python313-tokenizers-0.23.1-1.3.aarch64.rpm"
RPM_HASH = "bfdc4e0c3994ec1eebfbccffb675f1eb56250923c573cc3db08335896c88c2af309edd8febba4599b3e8197a2bcd792e61d7d26d743c7592ee52db88769b3e56"

RPROVIDES:${PN} += "python3-tokenizers \
python3.13dist-tokenizers \
python313-tokenizers \
python3dist-tokenizers"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-huggingface-hub"

inherit rpm
