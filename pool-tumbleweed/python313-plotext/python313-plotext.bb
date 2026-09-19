SUMMARY = "Plots directly on terminal"
DESCRIPTION = "plotext plots directly on terminal \
* it allows for scatter, line, bar, histogram and date-time plots (including candlestick), \
* it can also plot error bars, confusion matrices, and add extra text, lines and shapes to the plot, \
* you could use it to plot images (including GIFs) and stream video with audio (including YouTube), \
* it can save plots as text or as colored html, \
* it provides a simple function to color strings, \
* it comes with a dedicated command line tool"
LICENSE = "BSD-3-Clause"

PV = "5.3.2"

RPM_NAME = "python313-plotext-5.3.2-1.4.noarch.rpm"
RPM_HASH = "1bfe777d2958d7322295e0ad3f8845956568ae16b6a98665c43b68f6d522e5dea5082a0f9a3fc14f87bd3d9dc6c5d6d1a40858b94f4e51f41ccde10988efa647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plotext \
python3.13dist-plotext \
python313-plotext \
python3dist-plotext"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
alts \
python-abi"

inherit rpm
