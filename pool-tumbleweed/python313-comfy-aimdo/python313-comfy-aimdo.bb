SUMMARY = "AI Model Dynamic Offloader for ComfyUI (pure-Python fallback)"
DESCRIPTION = "AIMDO (AI Model Dynamic Offloader) is a PyTorch VRAM allocator used by \
ComfyUI to offload model weights under memory pressure. This build ships \
the pure-Python fallback. The native CUDA/HIP allocator is not compiled: \
it requires CUDA 12.8+ and a CUDA-enabled PyTorch, which Factory does \
not provide. Without the native module, init() returns False and ComfyUI \
continues without AIMDO."
LICENSE = "GPL-3.0-only"

PV = "0.5.3"

RPM_NAME = "python313-comfy-aimdo-0.5.3-1.1.noarch.rpm"
RPM_HASH = "ae13a1985560cf2b2818046ed1130562023795404a37062c21e1b7ba01cc18172bb9e659ba45215dc2d1fc6bca6bff1fedc02a3bbb757e037a7ae860947bdd85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfy-aimdo \
python3.13dist-comfy-aimdo \
python313-comfy-aimdo \
python3dist-comfy-aimdo"

RDEPENDS:${PN} += "python-abi \
python313-torch"

inherit rpm
