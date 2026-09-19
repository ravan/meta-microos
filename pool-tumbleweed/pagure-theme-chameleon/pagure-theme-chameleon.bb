SUMMARY = "Pagure web interface theme based on openSUSE's chameleon theme"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as openSUSE Infrastructure."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-theme-chameleon-5.14.1-3.3.noarch.rpm"
RPM_HASH = "35f11ab1b031c697b49aa24b1a71a36a52fc1f12cc3f527182feb1c122aab3bbc25c9a1dff0babcf3bf5ef69a6855f5bf6cb0e99d8f297ff79c3893f2207f4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-chameleon"

RDEPENDS:${PN} += "pagure"

inherit rpm
