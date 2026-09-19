SUMMARY = "Digital TV guide"
DESCRIPTION = "TV-Browser is Plugin based digital TV guide. Plugins can be installed with \
the download function of TV-Browser."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.7"

RPM_NAME = "tvbrowser-4.2.7-2.10.noarch.rpm"
RPM_HASH = "3adede8e73802d202ddeea9c687e003afce5dc0ac1a399822a14fa266b801ec9533f305faba77535d0416c4b478e227d2d7b09fe1040dcd0156ba5eeb025da57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tvbrowser"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
java"

inherit rpm
