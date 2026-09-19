SUMMARY = "AI Model Dynamic Offloader for ComfyUI (pure-Python fallback)"
DESCRIPTION = "AIMDO (AI Model Dynamic Offloader) is a PyTorch VRAM allocator used by \
ComfyUI to offload model weights under memory pressure. This build ships \
the pure-Python fallback. The native CUDA/HIP allocator is not compiled: \
it requires CUDA 12.8+ and a CUDA-enabled PyTorch, which Factory does \
not provide. Without the native module, init() returns False and ComfyUI \
continues without AIMDO."
LICENSE = "GPL-3.0-only"

PV = "0.5.3"

RPM_NAME = "python314-comfy-aimdo-0.5.3-1.1.noarch.rpm"
RPM_HASH = "e15c46a7c8c6e6ba3e028d09e4ea3ff6646780b98d8a0244aeccf54671a0e5b300f45d772e1c8d01b2fddf1ffcf2012fe70d0e671b20d93ecc20967240a179b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfy-aimdo \
python314-comfy-aimdo \
python3dist-comfy-aimdo"

RDEPENDS:${PN} += "python-abi \
python314-torch"

inherit rpm
