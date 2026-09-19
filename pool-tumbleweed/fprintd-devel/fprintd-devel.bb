SUMMARY = "Development files for fprintd"
DESCRIPTION = "Development documentation for fprintd, the D-Bus service for \
fingerprint readers access."
LICENSE = "GFDL-1.1-or-later"

PV = "1.94.5"

RPM_NAME = "fprintd-devel-1.94.5-1.4.noarch.rpm"
RPM_HASH = "47c5980821965a20b5be9a6a47fdbbe4c81af8dd2fdb26f9cf7e057ad8caefbad434817b30db35dacad703f17204a139265eaaa4a3352de1c2e41e9fd49d25bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fprintd-devel"

RDEPENDS:${PN} += "fprintd \
gtk-doc"

inherit rpm
