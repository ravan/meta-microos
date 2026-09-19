SUMMARY = "Crux Theme for GTK+ 2"
DESCRIPTION = "This package provides the Crux GTK+ 2 theme."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-crux-2.20.2-23.6.noarch.rpm"
RPM_HASH = "317cc635512fa3a33cc239f8f03ffd0414907fcfea75305b260f9a65a711baa2fa6fdda57b7588a656138874ed0196a6d19475f55bd6bb0684f1b76e0526d597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-crux"

RDEPENDS:${PN} += "gtk2-engine-crux"

inherit rpm
