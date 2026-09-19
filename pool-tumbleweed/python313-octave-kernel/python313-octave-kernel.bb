SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python313-octave-kernel-1.0.3-1.2.noarch.rpm"
RPM_HASH = "c54f624e48adc047798927f19dccdb504d8e80a4925e935f299872b67ba22800434fef98fcb126f22c0a81c4b8f7eda5a9e261dfeafd567df402ece59edb4987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-octave-kernel \
python3-octave-kernel \
python3.13dist-octave-kernel \
python313-jupyter-octave-kernel \
python313-octave-kernel \
python3dist-octave-kernel"

RDEPENDS:${PN} += "jupyter-octave-kernel \
octave \
python-abi \
python313-ipykernel \
python313-jupyter-client \
python313-metakernel"

inherit rpm
