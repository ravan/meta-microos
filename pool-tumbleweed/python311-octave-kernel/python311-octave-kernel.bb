SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.36.0"

RPM_NAME = "python311-octave-kernel-0.36.0-2.5.noarch.rpm"
RPM_HASH = "cb0dff76c65c5b75e1e7cf62a1833e5095cd7a78e579738cf4cd11e5921d9d83c895ca6f5907c6107f8902ec9c25542b434ddc9000ad497c87df27268ea06afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-octave-kernel \
python311-jupyter-octave-kernel \
python311-octave-kernel \
python3dist-octave-kernel"

RDEPENDS:${PN} += "jupyter-octave-kernel \
octave \
python-abi \
python311-ipykernel \
python311-jupyter-client \
python311-metakernel"

inherit rpm
