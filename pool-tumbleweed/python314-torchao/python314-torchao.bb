SUMMARY = "PyTorch native quantization and sparsity"
DESCRIPTION = "TorchAO is a PyTorch-native library for quantization and sparsity of \
model weights and activations, for both training and inference. It \
integrates with torch.compile and FSDP2. This package is the CPU, \
pure-Python build (no CUDA kernels)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "python314-torchao-0.18.0-1.1.noarch.rpm"
RPM_HASH = "3b3320a89808f50cd39f9702e8d6d85f42793cbe9ad5c5b930d6189963dc0de734f97c80d665c6c3aea1af5beb0536a49fa77c37d459f3caa1bd0801099ff839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-torchao \
python314-torchao \
python3dist-torchao"

RDEPENDS:${PN} += "python-abi \
python314-torch"

inherit rpm
