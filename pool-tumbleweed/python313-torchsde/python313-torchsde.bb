SUMMARY = "SDE solvers and stochastic adjoint sensitivity analysis in PyTorch"
DESCRIPTION = "PyTorch implementation of differentiable stochastic differential \
equation (SDE) solvers with GPU support and efficient \
backpropagation. \
 \
This is a research project, not an official Google product."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python313-torchsde-0.2.6-1.1.noarch.rpm"
RPM_HASH = "8a0cacfa9b28ac2ee7ca8647e07206ac9be0ed33a1e5559f5fc81256e5d501ae32e9c4f300f821e3d1eac5c395822e3720475109915552b5d1a314625f287434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-torchsde \
python3.13dist-torchsde \
python313-torchsde \
python3dist-torchsde"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy \
python313-torch \
python313-trampoline"

inherit rpm
