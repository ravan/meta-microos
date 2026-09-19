SUMMARY = "Intelligent predictive text entry platform (documentation)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the libpresage API Documentation in HTML format."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "libpresage-doc-0.9.1-18.3.noarch.rpm"
RPM_HASH = "ec243765da849b7981c6afaed6a537c3758dab175612d9e086d413f513cbf6ff312820d451251218a83575464319fe52269c74b5bd43f6d6049de73ef72da159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpresage-doc"

RDEPENDS:${PN} += ""

inherit rpm
