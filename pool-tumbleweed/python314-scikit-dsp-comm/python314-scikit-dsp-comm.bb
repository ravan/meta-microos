SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python314-scikit-dsp-comm-1.2.0-4.5.noarch.rpm"
RPM_HASH = "6d94c04664b2f15e2dc56f1a194a3cdcd4f4abd22950316e248daa279dc1f7129d2f9e68b52414068a4f816d3d4d85af05c0dd0833ac101fdcaddafe41251363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scikit-dsp-comm \
python314-scikit-dsp-comm \
python3dist-scikit-dsp-comm"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy \
python314-scipy"

inherit rpm
