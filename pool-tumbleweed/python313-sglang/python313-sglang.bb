SUMMARY = "Fast serving framework for large language models"
DESCRIPTION = "SGLang is a fast serving framework for large language models and \
vision language models. \
 \
This is a CPU build: inference uses PyTorch's native CPU operators. \
The Rust PyO3 extensions (multimodal preprocess, native gRPC) are \
built. The embedded Rust server is not. CUDA kernels, sgl-kernel \
and flashinfer are not."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CDLA-Permissive-2.0 & ISC & MIT & MPL-2.0 & Unicode-3.0"

PV = "0.5.19"

RPM_NAME = "python313-sglang-0.5.19-1.1.aarch64.rpm"
RPM_HASH = "dd344b3cbb918264acd7ef217219e7ec8cec94759e460fb7d1fa75d1d535d1fcb309dcefddb62c63d9762c2bafeb6a150b6e1f1eda667000d2ba7375604202a8"

RPROVIDES:${PN} += "python3-sglang \
python3.13dist-sglang \
python313-sglang \
python3dist-sglang"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python313-Pillow \
python313-SoundFile \
python313-aiohttp \
python313-anthropic \
python313-blobfile \
python313-compressed-tensors \
python313-datasets \
python313-easydict \
python313-einops \
python313-fastapi \
python313-gguf \
python313-interegular \
python313-ipython \
python313-llguidance \
python313-mistral-common \
python313-modelscope \
python313-msgspec \
python313-numpy \
python313-openai \
python313-openai-harmony \
python313-orjson \
python313-packaging \
python313-partial-json-parser \
python313-prometheus-client \
python313-psutil \
python313-pybase64 \
python313-pydantic \
python313-python-multipart \
python313-pyzmq \
python313-requests \
python313-scipy \
python313-sentencepiece \
python313-setproctitle \
python313-tabulate \
python313-tiktoken \
python313-timm \
python313-torch \
python313-torchaudio \
python313-torchvision \
python313-tqdm \
python313-transformers \
python313-uvicorn \
python313-uvloop \
python313-xgrammar \
python313-xxhash \
python313-zstandard"

inherit rpm
