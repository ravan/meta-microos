SUMMARY = "Development libraries for multipath-tools"
DESCRIPTION = "This package contains the development libraries for multipath-tools \
and libmpathpersist."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "0.15.1+229+suse.6c6f63e"

RPM_NAME = "multipath-tools-devel-0.15.1+229+suse.6c6f63e-1.1.aarch64.rpm"
RPM_HASH = "6f71edc8aa0b85c51b51ed713a08b6a36e297bcf202664da48a30463260acc8012a15179babe5f4145cd59c69182c4149c1caaf69f0bb3feae54213d7e68500f"

RPROVIDES:${PN} += "multipath-tools-devel"

RDEPENDS:${PN} += "libmpath0"

inherit rpm
