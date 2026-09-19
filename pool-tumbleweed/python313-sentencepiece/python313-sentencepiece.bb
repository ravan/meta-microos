SUMMARY = "Unsupervised text tokenizer and detokenizer"
DESCRIPTION = "SentencePiece is an unsupervised text tokenizer and detokenizer mainly for \
Neural Network-based text generation systems where the vocabulary size is \
predetermined prior to the neural model training. SentencePiece implements \
subword units (e.g. byte-pair-encoding and unigram language model) with the \
extension of direct training from raw sentences. \
 \
This package provides the Python bindings for SentencePiece."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python313-sentencepiece-0.2.2-1.2.aarch64.rpm"
RPM_HASH = "fb470d2bfee494b14ceec4c4da4cdeb275a38080f06a21f6d4d6053b5a22d2ab965209152c8f462c1af6cd9cd88c424ecb66b502e69de0e23bc3093e2d56efdf"

RPROVIDES:${PN} += "python3-sentencepiece \
python3.13dist-sentencepiece \
python313-sentencepiece \
python3dist-sentencepiece"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
