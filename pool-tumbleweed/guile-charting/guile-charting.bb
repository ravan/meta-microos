SUMMARY = "Guile library for making charts"
DESCRIPTION = "Guile-Charting is a library to create charts and graphs in Guile. It \
is thus far a hack."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "guile-charting-0.2.0-4.7.aarch64.rpm"
RPM_HASH = "5313df1708596352172c6c29e7b2651e762a49f2469515d1c042e3f925f6b6a660ebbecf3a503456681cc5bf0055961578394275eb56657148f8c4861a7f6b5e"

RPROVIDES:${PN} += "guile-charting"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
