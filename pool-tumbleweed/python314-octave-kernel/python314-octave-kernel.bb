SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python314-octave-kernel-1.0.3-1.2.noarch.rpm"
RPM_HASH = "5ca33f4d5b7a24acaeec104dace2b7b3cab73d2463f01eb6db54482831672214529ac833efa64971e021377c8e17a41f5b4683c3db90ec4753bde7772d415a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-octave-kernel \
python314-jupyter-octave-kernel \
python314-octave-kernel \
python3dist-octave-kernel"

RDEPENDS:${PN} += "jupyter-octave-kernel \
octave \
python-abi \
python314-ipykernel \
python314-jupyter-client \
python314-metakernel"

inherit rpm
