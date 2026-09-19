SUMMARY = "The python pandas[plot] extra"
DESCRIPTION = "This package provides the [plot] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-plot-3.0.5-2.2.noarch.rpm"
RPM_HASH = "11b30be9b8aaa915d51ad8357248b85b53a30fb189449d53c8009199573bea3fbbb6a7b5a430f0053e34fca6188c69d183c3662cdacb17381561caeebce0c4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-plot \
python313-pandas-plot"

RDEPENDS:${PN} += "python313-matplotlib \
python313-pandas"

inherit rpm
