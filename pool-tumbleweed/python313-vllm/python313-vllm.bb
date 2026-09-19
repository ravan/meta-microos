SUMMARY = "A high-throughput and memory-efficient inference and serving engine for LLMs"
DESCRIPTION = "vLLM is a fast and easy-to-use library for LLM inference and serving. \
 \
 \
 \
 \
 \
 \
 \
 \
 \
This build runs CPU inference through PyTorch's native CPU operators \
(VLLM_TARGET_DEVICE=empty): the CUDA/GPU kernels, vLLM's optional compiled \
CPU kernels, the audio/video (torchaudio/torchcodec/torchvision) helpers and \
the optional Rust-accelerated tool parser are not included. For the compiled \
CPU kernels install python-vllm-cpu instead."
LICENSE = "Apache-2.0"

PV = "0.29.0"

RPM_NAME = "python313-vllm-0.29.0-1.1.noarch.rpm"
RPM_HASH = "12286f81c7cbc5fc56154f1398bc17f2866b206332b5b696a2828ad33f78a43bf0e0c24ecd0d342f733f605a4da87317aa3171324a92369e089c66614ed091d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vllm \
python3.13dist-vllm \
python313-vllm \
python3dist-vllm"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Pillow \
python313-PyYAML \
python313-aiohttp \
python313-anthropic \
python313-blake3 \
python313-cachetools \
python313-cbor2 \
python313-cloudpickle \
python313-compressed-tensors \
python313-depyf \
python313-einops \
python313-fastapi \
python313-filelock \
python313-huggingface-hub \
python313-ijson \
python313-jsonschema \
python313-lark \
python313-llguidance \
python313-lm-format-enforcer \
python313-mcp \
python313-mistral-common \
python313-model-hosting-container-standards \
python313-msgspec \
python313-numba \
python313-numpy \
python313-openai \
python313-openai-harmony \
python313-opencv \
python313-opentelemetry-api \
python313-opentelemetry-exporter-otlp \
python313-opentelemetry-sdk \
python313-opentelemetry-semantic-conventions-ai \
python313-outlines-core \
python313-partial-json-parser \
python313-prometheus-client \
python313-prometheus-fastapi-instrumentator \
python313-protobuf \
python313-psutil \
python313-py-cpuinfo \
python313-pybase64 \
python313-pydantic \
python313-pydantic-extra-types \
python313-python-json-logger \
python313-pyzmq \
python313-regex \
python313-requests \
python313-safetensors \
python313-sentencepiece \
python313-setproctitle \
python313-six \
python313-starlette \
python313-tiktoken \
python313-tokenizers \
python313-torch \
python313-tqdm \
python313-transformers \
python313-typing-extensions \
python313-watchfiles \
python313-xgrammar"

inherit rpm
