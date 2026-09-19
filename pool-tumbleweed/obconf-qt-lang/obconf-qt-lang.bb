SUMMARY = "Translations for package obconf-qt"
DESCRIPTION = "Provides translations for the 'obconf-qt' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.6"

RPM_NAME = "obconf-qt-lang-0.16.6-1.5.noarch.rpm"
RPM_HASH = "29577e1d48787fe88bcd41253c3d8d2a1299789bb1f9d776c9345673ba0c305ed59aaffa9b2293ebf06012d8290bb7d2692c48da018808d7d3b5b85ca3cf3087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obconf-qt-lang \
obconf-qt-lang-all"

RDEPENDS:${PN} += "obconf-qt"

inherit rpm
