SUMMARY = "Tcl/Tk interface to Maxima"
DESCRIPTION = "A graphical interface to the Maxima symbolic computation program. It \
also provides Openmath, a graphics program that can be used from \
Maxima, and a Web browser that accepts a custom html tag to execute \
Maxima commands from an html page. \
 \
Xmaxima is written in the Tcl/Tk language."
LICENSE = "GPL-2.0-or-later"

PV = "5.50.0"

RPM_NAME = "maxima-xmaxima-5.50.0-2.2.noarch.rpm"
RPM_HASH = "4917a1d3fda870774b05f5243f43855b0abda04005a4be71c45e5db6c4f04b9fcbac69dfbc59f10c929183657f623eacd5267234d8008b580932312bc8f045a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maxima-xmaxima \
xmaxima"

RDEPENDS:${PN} += "/usr/bin/sh \
maxima \
tk"

inherit rpm
