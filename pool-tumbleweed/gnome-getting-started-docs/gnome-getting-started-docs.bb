SUMMARY = "Getting started with GNOME - Documentation"
DESCRIPTION = "This package contains the Getting Started guide which is packaged and \
shipped as gnome-getting-started-docs in the core GNOME distribution."
LICENSE = "CC-BY-SA-3.0"

PV = "3.38.1"

RPM_NAME = "gnome-getting-started-docs-3.38.1-1.16.noarch.rpm"
RPM_HASH = "312e9818bdc1ac32675090a2b7b03c85639b5fc3f78f64457dab7c0de2d06fafc9175b78da0b787a7c3d87cf84949ac482184a45c13aea556db1912afa9cecc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-getting-started-docs"

RDEPENDS:${PN} += "yelp"

inherit rpm
