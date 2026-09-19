SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "3.0.5"

RPM_NAME = "python313-pandas-computation-3.0.5-2.2.noarch.rpm"
RPM_HASH = "4e61932b709ff1ec89ceda82669f08d3d74cd4515040f6fdc764f1a8903d384f1be03a230d91f776964f84aee7fce1407267aa47bce8ef51e2e73298af812b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-computation \
python313-pandas-computation"

RDEPENDS:${PN} += "python313-pandas \
python313-scipy \
python313-xarray"

inherit rpm
