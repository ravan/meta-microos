SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.36.0"

RPM_NAME = "python312-octave-kernel-0.36.0-2.5.noarch.rpm"
RPM_HASH = "deec9ecac0e261b7be0b78eb8ba72b4e4c1d067a2aab2ca1c567611d3cc2dd1494a814880a139dee24695f6889d22921cd287f184ac3041b802827b07e45673b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-octave-kernel \
python312-jupyter-octave-kernel \
python312-octave-kernel \
python3dist-octave-kernel"

RDEPENDS:${PN} += "jupyter-octave-kernel \
octave \
python-abi \
python312-ipykernel \
python312-jupyter-client \
python312-metakernel"

inherit rpm
