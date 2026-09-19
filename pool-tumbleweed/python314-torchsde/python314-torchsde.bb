SUMMARY = "SDE solvers and stochastic adjoint sensitivity analysis in PyTorch"
DESCRIPTION = "PyTorch implementation of differentiable stochastic differential \
equation (SDE) solvers with GPU support and efficient \
backpropagation. \
 \
This is a research project, not an official Google product."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python314-torchsde-0.2.6-1.1.noarch.rpm"
RPM_HASH = "879b7c46d0531647dd47c3985a641f1b4d197067b79cabd1b79d475cdcc6b9ca5df97bfbd56ecffcad55e85f03f0058be7bef6e33fd281b0bffa2c6fbdb1f9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-torchsde \
python314-torchsde \
python3dist-torchsde"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy \
python314-torch \
python314-trampoline"

inherit rpm
