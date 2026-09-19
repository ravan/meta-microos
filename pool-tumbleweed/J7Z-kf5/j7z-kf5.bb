SUMMARY = "KF5 service menu for J7Z"
DESCRIPTION = "J7Z is an alternative 7-Zip GUI. \
This package contains the KF5 service menu."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "J7Z-kf5-1.4.2-3.5.noarch.rpm"
RPM_HASH = "8720c64c88ab081c3943c869e7928a3807eba7a3b142091f7bc333b11aceb41d212568becb45c403026735db95dfd5bad09aea92105133e8b651f7da23b3c588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "J7Z-kf5"

RDEPENDS:${PN} += "J7Z"

inherit rpm
