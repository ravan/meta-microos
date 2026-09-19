SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python311-scikit-dsp-comm-1.2.0-4.3.noarch.rpm"
RPM_HASH = "cf07a023cf5ebb7e1eec0c292ca9481a0686a8cb1882af33957077b7fe37b6c0fd714cc5c1aecf5f9de3fa7444b1605d45701e2add02822fda23caf4e61463cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-scikit-dsp-comm \
python311-scikit-dsp-comm \
python3dist-scikit-dsp-comm"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-scipy"

inherit rpm
