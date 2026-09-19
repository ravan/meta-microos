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

RPM_NAME = "python314-sglang-0.5.19-1.1.aarch64.rpm"
RPM_HASH = "b4b038f800cc998cc54c18def52dc510fce77cbabcc00e2df02d189656487b1729e0e68d3d615a0bbe0cf22d562bfa16ad566ff2078a429c607110899eb959b1"

RPROVIDES:${PN} += "python3.14dist-sglang \
python314-sglang \
python3dist-sglang"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python314-Pillow \
python314-SoundFile \
python314-aiohttp \
python314-anthropic \
python314-blobfile \
python314-compressed-tensors \
python314-datasets \
python314-easydict \
python314-einops \
python314-fastapi \
python314-gguf \
python314-interegular \
python314-ipython \
python314-llguidance \
python314-mistral-common \
python314-modelscope \
python314-msgspec \
python314-numpy \
python314-openai \
python314-openai-harmony \
python314-orjson \
python314-packaging \
python314-partial-json-parser \
python314-prometheus-client \
python314-psutil \
python314-pybase64 \
python314-pydantic \
python314-python-multipart \
python314-pyzmq \
python314-requests \
python314-scipy \
python314-sentencepiece \
python314-setproctitle \
python314-tabulate \
python314-tiktoken \
python314-timm \
python314-torch \
python314-torchaudio \
python314-torchvision \
python314-tqdm \
python314-transformers \
python314-uvicorn \
python314-uvloop \
python314-xgrammar \
python314-xxhash \
python314-zstandard"

inherit rpm
