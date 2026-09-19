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

RPM_NAME = "python314-plotext-5.3.2-1.4.noarch.rpm"
RPM_HASH = "1ada98e98a179806c288f03955b7224b64f1a6bbb7f467ac8d3c0aacd37439453873c7d3c4276128154105959e2555b656cee43a905b453dfcc6aa49515e3ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-plotext \
python314-plotext \
python3dist-plotext"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.14 \
alts \
python-abi"

inherit rpm
