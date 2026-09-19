SUMMARY = "Color filesystem layout"
DESCRIPTION = "This package provides directories and rpm macros that are required/used to store color management data for many applications."
LICENSE = "SUSE-Public-Domain"

PV = "1"

RPM_NAME = "color-filesystem-1-13.24.noarch.rpm"
RPM_HASH = "b85f750397a2f3788bd3e8e61fc09b5b5691015f8856dcd285a71f4e6cc7723689cd2636b05c8de1a85e39d98235e5afef7843bc9c17b427f162bdc5655ac933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "color-filesystem \
icc-dirs"

RDEPENDS:${PN} += "filesystem \
rpm"

inherit rpm
