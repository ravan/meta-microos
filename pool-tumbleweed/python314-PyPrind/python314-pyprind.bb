SUMMARY = "Python progress bar and percent indicator utility"
DESCRIPTION = "The PyPrind (Python Progress Indicator) module provides a progress \
bar and a percentage indicator object that let track the progress \
of a loop structure or other iterative computation. \
A typical application is the processing of large data sets for \
which to provide an intuitive estimate at runtime about the \
computation progress."
LICENSE = "BSD-3-Clause"

PV = "2.11.3"

RPM_NAME = "python314-PyPrind-2.11.3-2.5.noarch.rpm"
RPM_HASH = "d28e79367243ea034fc9c79f42ed4fd862634b4c7e54e7f3a52262e4a501ce83255e47d97c3ba65143b726d9e53196b2c46bc7c6bb1e3b5d0d82bd5a74814d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyprind \
python314-PyPrind \
python3dist-pyprind"

RDEPENDS:${PN} += "python-abi \
python314-psutil"

inherit rpm
