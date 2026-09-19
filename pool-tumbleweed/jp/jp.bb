SUMMARY = "JSON/CSV data plotting program for the terminal"
DESCRIPTION = "This program generates terminal plots from JSON (or CSV) data. Bar charts, \
line charts, scatter plots, histograms and heatmaps are supported."
LICENSE = "MIT"

PV = "1.1.12"

RPM_NAME = "jp-1.1.12-3.8.aarch64.rpm"
RPM_HASH = "c8439aed308aba7dc9cdbf3ac4bfd1142672fcda2ccc1c916367dec7721950e9f61b706153adc9890f057795962d20c310399e8bfcedf7b6e9e5165423f0dc4c"

RPROVIDES:${PN} += "jp"

RDEPENDS:${PN} += ""

inherit rpm
