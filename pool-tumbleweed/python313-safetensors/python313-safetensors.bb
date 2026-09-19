SUMMARY = "Simple, safe way to store and distribute tensors"
DESCRIPTION = "safetensors is a new simple format for storing tensors safely (as opposed to \
pickle) and that is still fast (zero-copy). It supports Numpy, PyTorch, \
TensorFlow, PaddlePaddle, Flax (JAX) and MLX, and is designed to be a safe and \
fast replacement for the traditional pickle-based tensor storage."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python313-safetensors-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "d99fb36e3e1d74daf29f4ff9043a05c50d91d73d7fff2ceb45cb97e503a6cb331ef2ff9c1e5b8f0a4f51a187ed70cd9e65f64114e82125ea16b3df8dfdd5ffba"

RPROVIDES:${PN} += "python3-safetensors \
python3.13dist-safetensors \
python313-safetensors \
python3dist-safetensors"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
