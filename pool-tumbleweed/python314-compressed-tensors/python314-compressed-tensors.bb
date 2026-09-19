SUMMARY = "Library for utilization of compressed safetensors of neural network models"
DESCRIPTION = "compressed-tensors extends the safetensors format, providing a versatile \
and efficient way to store and manage compressed (quantized and sparse) \
tensor data for neural network models. It supports a variety of \
quantization and sparsity schemes and integrates with the safetensors \
storage layout used by machine-learning frameworks."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "python314-compressed-tensors-0.18.0-1.1.noarch.rpm"
RPM_HASH = "81598d0dd33a8a5c16a797f359e04ea608f7d8ef16114719ba376f3fc58f8272f08a478a820078bf38a7dd51045219dee36cc5ecd991a43896e0c7dec6a6a5a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-compressed-tensors \
python314-compressed-tensors \
python3dist-compressed-tensors"

RDEPENDS:${PN} += "python-abi \
python314-loguru \
python314-psutil \
python314-pydantic \
python314-torch \
python314-transformers"

inherit rpm
