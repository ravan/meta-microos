SUMMARY = "Configuration for pagure to default to the openSUSE web interface theme"
DESCRIPTION = "This package sets the default web interface assets used for \
a Pagure server running on openSUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-theme-default-openSUSE-5.14.1-3.3.noarch.rpm"
RPM_HASH = "ffb2395b980edd75b5780808bdf29f6ff956a04541f20f9829e378cc6bf90a1610e8a708766f434537af27d8866f0d18f1dc40c4813585e3e35575b80d05d82d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-default \
pagure-theme-default-openSUSE"

RDEPENDS:${PN} += "pagure-theme-chameleon"

inherit rpm
