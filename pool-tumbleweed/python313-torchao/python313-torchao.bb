SUMMARY = "PyTorch native quantization and sparsity"
DESCRIPTION = "TorchAO is a PyTorch-native library for quantization and sparsity of \
model weights and activations, for both training and inference. It \
integrates with torch.compile and FSDP2. This package is the CPU, \
pure-Python build (no CUDA kernels)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "python313-torchao-0.18.0-1.1.noarch.rpm"
RPM_HASH = "d2db08426693f3f9132f0c8dd318d221fad6c7d47d3d85ceb7c31410108e2f9ed4662d513d2887131611f99f1e04c9018847c93402d0e551c37d8d153ac4b799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-torchao \
python3.13dist-torchao \
python313-torchao \
python3dist-torchao"

RDEPENDS:${PN} += "python-abi \
python313-torch"

inherit rpm
