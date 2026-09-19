SUMMARY = "Tool to make ternary plots in python"
DESCRIPTION = "This is a plotting library for use with matplotlib to make ternary plots plots \
in the two dimensional simplex projected onto a two dimensional plane. \
 \
The library provides functions for plotting projected lines, curves \
(trajectories), scatter plots, and heatmaps."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python313-python-ternary-1.0.8-2.5.noarch.rpm"
RPM_HASH = "908ae2683fa6573d09ca9fcaffb7ec7b19363de6d1fb39bdabc46426db1d1a79028af6a44d44b6bb66c165a80f73ff7386e493c030632cd5d3b6b662d140b0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-ternary \
python3.13dist-python-ternary \
python313-python-ternary \
python3dist-python-ternary"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib"

inherit rpm
