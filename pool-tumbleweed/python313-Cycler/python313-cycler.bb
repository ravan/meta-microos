SUMMARY = "Composable style cycles"
DESCRIPTION = "When plotting more than one line it is common to want to be able to \
cycle over one or more artist styles. For simple cases than can be \
done with out too much trouble. \
 \
However, if you want to do something more complicated, the plotting \
logic can quickly become very involved. To address this and allow \
easy cycling over arbitrary kwargs the Cycler class, a composable \
kwarg iterator, was developed."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python313-Cycler-0.12.1-1.12.noarch.rpm"
RPM_HASH = "399f62b46849338e20fee03cbf9b29f307a67d461e8519ba9c145b94c3235d70d86a3697def1db7a0ceb0cb657c9afbdba205643fcc8bee23291f15ec7deae9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Cycler \
python3.13dist-cycler \
python313-Cycler \
python3dist-cycler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
