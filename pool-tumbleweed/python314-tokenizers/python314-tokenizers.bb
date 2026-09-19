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

RPM_NAME = "python314-tokenizers-0.23.1-1.3.aarch64.rpm"
RPM_HASH = "418c60075ac2ef8bb99edb0117e0aa1bdf7dad30f0b917a468d66e74cedf5faa6d7eea15ff917bf4551474dcefc6a47976b00dadc8cff1a828f3f873116d82f8"

RPROVIDES:${PN} += "python3.14dist-tokenizers \
python314-tokenizers \
python3dist-tokenizers"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-huggingface-hub"

inherit rpm
