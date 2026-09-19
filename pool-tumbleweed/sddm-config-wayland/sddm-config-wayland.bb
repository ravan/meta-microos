SUMMARY = "Config to let SDDM run using wayland"
DESCRIPTION = "This package adds a config file to let SDDM run with wayland as backend \
instead of X11."
LICENSE = "GPL-3.0"

PV = "1.0"

RPM_NAME = "sddm-config-wayland-1.0-1.3.noarch.rpm"
RPM_HASH = "127e50c3f4ec3ecd66c0a0e13f80a234ed846ef4093f2ffa99fd4efaa8c9a15e376c25c14bb0e0dfad5ab3bc3ad9a4e4763c49d76a6b3cf8603876b73717d646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sddm-config-wayland"

RDEPENDS:${PN} += "sddm-qt6"

inherit rpm
