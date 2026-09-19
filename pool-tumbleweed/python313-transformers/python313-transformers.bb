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

RPM_NAME = "python313-transformers-5.17.0-1.1.noarch.rpm"
RPM_HASH = "66294a278663931b93ce067a7b10219e5a9616bfc38ae9ade0cc62bf7289c0032d841c887050343b0ca5364783390b9e8d3f5f6c3ea72b3404f30c31755a9a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transformers \
python3.13dist-transformers \
python313-transformers \
python3dist-transformers"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-huggingface-hub \
python313-numpy \
python313-packaging \
python313-regex \
python313-safetensors \
python313-tokenizers \
python313-tqdm \
python313-typer"

inherit rpm
