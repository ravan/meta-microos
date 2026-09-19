SUMMARY = "Java bindings for NLopt"
DESCRIPTION = "This package provides java bindings for NLopt, a nonlinear optimization \
library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.11.0"

RPM_NAME = "nlopt-java-2.11.0-1.4.noarch.rpm"
RPM_HASH = "d3fb7d1bccf0a6633b6338dca501fa8ff2d6e3233933f0df7499c94053bd0ba3e49679a457c2bdfdf5244072480342cfb88a96f495dcb53971ab8ed5f47d8c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nlopt-java"

RDEPENDS:${PN} += ""

inherit rpm
