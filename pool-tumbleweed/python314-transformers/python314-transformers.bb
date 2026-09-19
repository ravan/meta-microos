SUMMARY = "State-of-the-art Machine Learning for JAX, PyTorch and TensorFlow"
DESCRIPTION = "Transformers provides thousands of pretrained models to perform tasks on \
different modalities such as text, vision, and audio. \
 \
These models can be applied on text, for tasks like text classification, \
information extraction, question answering, summarization, translation \
and text generation; on images, for tasks like image classification, \
object detection and segmentation; and on audio, for tasks like speech \
recognition and audio classification. \
 \
The library is designed with two strong goals in mind: be as easy and \
fast to use as possible, and provide state-of-the-art models with a \
unified API."
LICENSE = "Apache-2.0"

PV = "5.17.0"

RPM_NAME = "python314-transformers-5.17.0-1.1.noarch.rpm"
RPM_HASH = "8062c835a089ada9c2bf1dc2faf8160b54c684521af82d304bce6528b115560e4252be929245138f2824bff38e0d2006f03f9be690d24895620d61dace5ed461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-transformers \
python314-transformers \
python3dist-transformers"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-huggingface-hub \
python314-numpy \
python314-packaging \
python314-regex \
python314-safetensors \
python314-tokenizers \
python314-tqdm \
python314-typer"

inherit rpm
