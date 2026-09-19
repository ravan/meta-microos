SUMMARY = "A Set of Megawidgets for Tcl/Tk"
DESCRIPTION = "Add useful and nice-looking widgets to your interfaces with the BWidget \
Toolkit, a set of native Tk 8.x Widgets using Tcl8.x namespaces. The \
BWidgets have a professional look and feel as in other well-known \
toolkits (Tix or Incr Widget). However, the concept is radically \
different because everything is native. There is no platform \
compilation and no compiled extension libraries are needed. The code is \
in pure Tcl/Tk."
LICENSE = "BSD-3-Clause"

PV = "1.9.14"

RPM_NAME = "bwidget-1.9.14-1.16.noarch.rpm"
RPM_HASH = "288251c50b9fc979711a401e807456570d1c8d5d02f5d5ce21484dc14c8f2821afbcf1c7827c34ae0822dab747d3426b4e3e906c60395428adc573ec3ea8f120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bwidget"

RDEPENDS:${PN} += "tk"

inherit rpm
