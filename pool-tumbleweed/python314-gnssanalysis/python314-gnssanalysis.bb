SUMMARY = "GNSS-related functionality from Geoscience Australia"
DESCRIPTION = "The package encompasses various GNSS-related functionality such as efficient \
reading and writing GNSS files (e.g. SINEX, SP3, CLK, IONEX and many others), \
advanced analysis and comparison, various coordinate transformations including \
geodetic frame rotations, predictions and combinations. Package Solver."
LICENSE = "BSD-3-Clause"

PV = "0.0.60"

RPM_NAME = "python314-gnssanalysis-0.0.60-1.2.noarch.rpm"
RPM_HASH = "5ef75adb3b0b4d29b4b33df44839a835dc56e0f36198e4f74269c2ca7ad24c7d07daf1176ac2ebbc73dbbc24052eb06f80c81a4a7c8ad112ada99c86e7bcbd29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gnssanalysis \
python314-gnssanalysis \
python3dist-gnssanalysis"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-boto3 \
python314-click \
python314-hatanaka \
python314-jinja2 \
python314-matplotlib \
python314-numpy \
python314-pandas \
python314-plotext \
python314-plotly \
python314-pyfakefs \
python314-pymongo \
python314-pytest \
python314-scipy \
python314-tqdm \
python314-typing-extensions \
python314-unlzw3"

inherit rpm
