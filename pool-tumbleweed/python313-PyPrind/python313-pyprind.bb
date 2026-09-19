SUMMARY = "Python progress bar and percent indicator utility"
DESCRIPTION = "The PyPrind (Python Progress Indicator) module provides a progress \
bar and a percentage indicator object that let track the progress \
of a loop structure or other iterative computation. \
A typical application is the processing of large data sets for \
which to provide an intuitive estimate at runtime about the \
computation progress."
LICENSE = "BSD-3-Clause"

PV = "2.11.3"

RPM_NAME = "python313-PyPrind-2.11.3-2.5.noarch.rpm"
RPM_HASH = "ba0de664f567d72107996eafc1e8f12c79dac194d7f31ce5a84b7a1d79b0bb1543635a5a24bd9be48526eddebcd23789132bf1737c76bb7df6a71f3f2a5fab51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyPrind \
python3.13dist-pyprind \
python313-PyPrind \
python3dist-pyprind"

RDEPENDS:${PN} += "python-abi \
python313-psutil"

inherit rpm
