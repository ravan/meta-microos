SUMMARY = "Metakernel for Jupyter"
DESCRIPTION = "A Jupyter/IPython kernel template which includes core magic functions \
(including help, command and file path completion, parallel and \
distributed processing, downloads, and much more)."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python313-metakernel-1.0.0-1.2.noarch.rpm"
RPM_HASH = "5314c4f16a6b0894192a9672ae7911aba31a3becd87c870d5d52c4f42b3f9985168c8b97a12d1f800b0a2d0af2281f5958a58315e2ade777a0f5e1feb3f20c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-metakernel \
python3-jupyter-metakernel \
python3-metakernel \
python3.13dist-metakernel \
python313-jupyter-metakernel \
python313-metakernel \
python3dist-metakernel"

RDEPENDS:${PN} += "python-abi \
python313-comm \
python313-ipykernel \
python313-jedi \
python313-jupyter-core \
python313-pexpect"

inherit rpm
