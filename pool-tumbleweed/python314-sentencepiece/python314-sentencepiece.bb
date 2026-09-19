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

RPM_NAME = "python314-sentencepiece-0.2.2-1.2.aarch64.rpm"
RPM_HASH = "4a46b79e666d424b6051c6a2b5ee7ee43a331a3b0aa512b4521e12a1c96cec41a6a6312d73ca35125321ddd80787443d7ee779b9991ccdf5b6d2d96dd11fc1f1"

RPROVIDES:${PN} += "python3.14dist-sentencepiece \
python314-sentencepiece \
python3dist-sentencepiece"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
