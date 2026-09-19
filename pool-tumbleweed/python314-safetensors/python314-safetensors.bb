SUMMARY = "Simple, safe way to store and distribute tensors"
DESCRIPTION = "safetensors is a new simple format for storing tensors safely (as opposed to \
pickle) and that is still fast (zero-copy). It supports Numpy, PyTorch, \
TensorFlow, PaddlePaddle, Flax (JAX) and MLX, and is designed to be a safe and \
fast replacement for the traditional pickle-based tensor storage."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "python314-safetensors-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "5801038c04509a0817acbec0fb6fd714a09a3f3441c3caeba4738b7ad59fc9f60b7d168280cf277f14930cd9a218f8016f33ba8757cf1fd1c8c6d21305984f67"

RPROVIDES:${PN} += "python3.14dist-safetensors \
python314-safetensors \
python3dist-safetensors"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
