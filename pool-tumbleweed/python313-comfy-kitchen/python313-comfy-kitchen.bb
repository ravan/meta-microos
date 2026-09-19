SUMMARY = "Fast kernel library for ComfyUI (CPU/eager backend)"
DESCRIPTION = "Comfy Kitchen is a kernel library for diffusion-model inference used \
by ComfyUI. This build ships the pure-Python eager (CPU) backend. \
Native CUDA and HIP extensions are not compiled: Factory python-torch \
is CPU-only and has no CUDA flavor."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.33"

RPM_NAME = "python313-comfy-kitchen-0.2.33-1.1.noarch.rpm"
RPM_HASH = "bca171df91c6f892cfd6b5847d48f998d21febb08a3fad98649e1289be9a4c73d7fb4bf75abf5f43e70923ab89fbcbe340236aee21142c6ff975fd0a21cbab46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfy-kitchen \
python3.13dist-comfy-kitchen \
python313-comfy-kitchen \
python3dist-comfy-kitchen"

RDEPENDS:${PN} += "python-abi \
python313-torch"

inherit rpm
