SUMMARY = "Guile bindings to Newt"
DESCRIPTION = "This package provides Guile bindings to Newt, a library for text based user \
interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "guile-newt-0.0.3-2.9.aarch64.rpm"
RPM_HASH = "90d9648d0680b77e7f4abb6d31214d9040f011aed91239126f60804432fd5642866b77ec82600ab56304fc9abdcbaec6c0ade8fa64150c65cf44c51ef315906d"

RPROVIDES:${PN} += "guile-newt"

RDEPENDS:${PN} += "guile \
newt-devel"

inherit rpm
