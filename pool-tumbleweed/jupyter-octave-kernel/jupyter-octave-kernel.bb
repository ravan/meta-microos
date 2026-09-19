SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "jupyter-octave-kernel-1.0.3-1.2.noarch.rpm"
RPM_HASH = "4fd51490171590849852b782cc37e3ec90fdff2d1df9c6394877140bf069bf01fbd5ee6513f6e5edc7d54c5b75b0378d48388d0b3f4e21649b55383fe2e5ffaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-octave-kernel"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-octave-kernel"

inherit rpm
