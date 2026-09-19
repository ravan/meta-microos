SUMMARY = "GNSS-related functionality from Geoscience Australia"
DESCRIPTION = "The package encompasses various GNSS-related functionality such as efficient \
reading and writing GNSS files (e.g. SINEX, SP3, CLK, IONEX and many others), \
advanced analysis and comparison, various coordinate transformations including \
geodetic frame rotations, predictions and combinations. Package Solver."
LICENSE = "BSD-3-Clause"

PV = "0.0.60"

RPM_NAME = "python313-gnssanalysis-0.0.60-1.2.noarch.rpm"
RPM_HASH = "47edfe9e2151b89490fcf9427cda5c75d7fb35413fc0d00fdd7e0eb13757d7ed894dac38babb141da2abb848c4de95582d4cdeb8c8fe25854649924e18ecfd3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gnssanalysis \
python3.13dist-gnssanalysis \
python313-gnssanalysis \
python3dist-gnssanalysis"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-boto3 \
python313-click \
python313-hatanaka \
python313-jinja2 \
python313-matplotlib \
python313-numpy \
python313-pandas \
python313-plotext \
python313-plotly \
python313-pyfakefs \
python313-pymongo \
python313-pytest \
python313-scipy \
python313-tqdm \
python313-typing-extensions \
python313-unlzw3"

inherit rpm
