SUMMARY = "SUSE Brand File Supplementing Upstream Look and Feel"
DESCRIPTION = "This package contains the file /usr/etc/SUSE-brand, and its name is used as \
a trigger for installation of look and feel and branding of packages as \
it was defined by upstream developers. \
 \
WARNING: If you decide to install this package instead of the default \
branding package, you will lose vendor customization of your \
distribution."
LICENSE = "MIT"

PV = "16.0"

RPM_NAME = "branding-upstream-16.0-1.15.noarch.rpm"
RPM_HASH = "24741ff6bd3896d9430604575787738d6fdc635f2850ab60de6717e56920f33ade1fdec8ddd8011efa5caefdc6ce0e351e6448380ab9c78b0483b54238dc1412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "branding \
branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
