SUMMARY = "Tool to make ternary plots in python"
DESCRIPTION = "This is a plotting library for use with matplotlib to make ternary plots plots \
in the two dimensional simplex projected onto a two dimensional plane. \
 \
The library provides functions for plotting projected lines, curves \
(trajectories), scatter plots, and heatmaps."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python314-python-ternary-1.0.8-2.5.noarch.rpm"
RPM_HASH = "e439f321885f926545a99625f8a17152158f3de661a0e5db224ae9a2eac9a337484342e2a416024b07ffa4f3efae2c046cb579cadf870534eb53dcd6ade17e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-ternary \
python314-python-ternary \
python3dist-python-ternary"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib"

inherit rpm
