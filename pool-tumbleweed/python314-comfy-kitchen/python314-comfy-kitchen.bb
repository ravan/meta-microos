SUMMARY = "Fast kernel library for ComfyUI (CPU/eager backend)"
DESCRIPTION = "Comfy Kitchen is a kernel library for diffusion-model inference used \
by ComfyUI. This build ships the pure-Python eager (CPU) backend. \
Native CUDA and HIP extensions are not compiled: Factory python-torch \
is CPU-only and has no CUDA flavor."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.33"

RPM_NAME = "python314-comfy-kitchen-0.2.33-1.1.noarch.rpm"
RPM_HASH = "51ddb3563c8f8f374a325ea68b84a6fb6733e7280675416ee5834e36fe6d48693304d6033caa57e3b7c6249492633a3230ed87f9810521fb16ab3b22e2cab5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfy-kitchen \
python314-comfy-kitchen \
python3dist-comfy-kitchen"

RDEPENDS:${PN} += "python-abi \
python314-torch"

inherit rpm
