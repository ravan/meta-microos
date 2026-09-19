SUMMARY = "Modular node-graph engine for local AI content creation"
DESCRIPTION = "ComfyUI is a node-graph engine for local AI content creation. Workflows \
are assembled from nodes that load diffusion models, encoders, LoRAs and \
other assets, and can produce images, video, audio and 3D output. A local \
HTTP API and a browser UI are included. \
 \
The packaged tree is read-only. Models, custom nodes, input, output, temp \
and user state live under the per-user --base-directory (default: \
$XDG_DATA_HOME/comfyui or ~/.local/share/comfyui); the custom nodes shipped \
with ComfyUI itself are loaded from the package tree as well. \
ComfyUI-Manager is not enabled."
LICENSE = "GPL-3.0-only"

PV = "0.35.0"

RPM_NAME = "comfyui-0.35.0-1.1.noarch.rpm"
RPM_HASH = "a0598f098d81023c209150f0af153c75172091a3b2cd8250f73f7cf357dd6137fbec5cdf34eb0b36b701fb90350365c5b7e071b3b2c9d3240f5f406a3370bbb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "comfyui"

RDEPENDS:${PN} += "/usr/bin/sh \
python313-Pillow \
python313-PyYAML \
python313-SQLAlchemy \
python313-aiohttp \
python313-alembic \
python313-av \
python313-blake3 \
python313-comfy-aimdo \
python313-comfy-kitchen \
python313-comfyui-embedded-docs \
python313-comfyui-frontend-package \
python313-comfyui-workflow-templates \
python313-einops \
python313-filelock \
python313-numpy \
python313-psutil \
python313-pydantic \
python313-pydantic-settings \
python313-requests \
python313-safetensors \
python313-scipy \
python313-sentencepiece \
python313-simpleeval \
python313-tokenizers \
python313-torch \
python313-torchaudio \
python313-torchsde \
python313-torchvision \
python313-tqdm \
python313-transformers \
python313-yarl"

inherit rpm
