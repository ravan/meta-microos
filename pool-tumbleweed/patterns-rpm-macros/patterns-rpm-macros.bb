SUMMARY = "RPM macros for building of patterns modules"
DESCRIPTION = "This package contains SUSE RPM macros to aid creating patterns."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "patterns-rpm-macros-1.0-9.6.noarch.rpm"
RPM_HASH = "62cfb8dd76b50ca712211aa12284856ebc0fe5f1dbadab1c19b989f5bbdb1eed70e6f57e0aa179d174fccf43d52f2c78100a9ea7ba7b9c7da06ddbaabc288765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patterns-rpm-macros \
rpm-macro-obsolete-legacy-pattern \
rpm-macro-pattern-additionalsoftware \
rpm-macro-pattern-advsysmgmt \
rpm-macro-pattern-basetechnologies \
rpm-macro-pattern-budgiedesktop \
rpm-macro-pattern-deepindesktop \
rpm-macro-pattern-desktopfunctions \
rpm-macro-pattern-desktops \
rpm-macro-pattern-development \
rpm-macro-pattern-documentation \
rpm-macro-pattern-gnomedesktop \
rpm-macro-pattern-graphicalenvironments \
rpm-macro-pattern-kdedesktop \
rpm-macro-pattern-lxdedesktop \
rpm-macro-pattern-matedesktop \
rpm-macro-pattern-pantheondesktop \
rpm-macro-pattern-primaryfunctions \
rpm-macro-pattern-proprietarysoftware \
rpm-macro-pattern-publicclouds \
rpm-macro-pattern-serverfunctions \
rpm-macro-pattern-xfcedesktop \
rpm-macro-recommends-on-traditional \
rpm-macro-requires-on-traditional \
rpm-macro-requires-on-transactional \
rpm-macro-requires-on-transactional-recommends-otherwise"

RDEPENDS:${PN} += ""

inherit rpm
