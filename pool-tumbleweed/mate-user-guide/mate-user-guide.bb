SUMMARY = "User guide for the MATE desktop"
DESCRIPTION = "This package contains documentation targeted for end-users of \
MATE Desktop Environment with general MATE applicability."
LICENSE = "GFDL-1.1-or-later"

PV = "1.28.0"

RPM_NAME = "mate-user-guide-1.28.0-2.4.noarch.rpm"
RPM_HASH = "97a7d6c26a4bbe55b31c4b8ee208db8e75a5b79528b977cbfe72a4bbce2d580be93292f292047ef57387c6f4f029547a577dca5c51552619d02f5f57e57b08d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-user-guide"

RDEPENDS:${PN} += "yelp"

inherit rpm
