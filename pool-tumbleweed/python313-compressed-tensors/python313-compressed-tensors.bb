SUMMARY = "Library for utilization of compressed safetensors of neural network models"
DESCRIPTION = "compressed-tensors extends the safetensors format, providing a versatile \
and efficient way to store and manage compressed (quantized and sparse) \
tensor data for neural network models. It supports a variety of \
quantization and sparsity schemes and integrates with the safetensors \
storage layout used by machine-learning frameworks."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "python313-compressed-tensors-0.18.0-1.1.noarch.rpm"
RPM_HASH = "5a52853e6bf6d1d3af39e0281566c1c5a6dc1082452b7bb2509611fad620443784c47875a238f248f18de4978d622f64133cd61c9c4649ca6128fe148cf4ad48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compressed-tensors \
python3.13dist-compressed-tensors \
python313-compressed-tensors \
python3dist-compressed-tensors"

RDEPENDS:${PN} += "python-abi \
python313-loguru \
python313-psutil \
python313-pydantic \
python313-torch \
python313-transformers"

inherit rpm
