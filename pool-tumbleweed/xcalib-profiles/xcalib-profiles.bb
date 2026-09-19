SUMMARY = "ICC profiles for testing with xcalib"
DESCRIPTION = "The ICC profiles are special for testing xcalib."
LICENSE = "GPL-2.0-or-later"

PV = "0.10"

RPM_NAME = "xcalib-profiles-0.10-2.6.noarch.rpm"
RPM_HASH = "24b388c158460725afd0d90dc27820408cce00cd7263f4641be2d8b728064b6e5d7cabbdc4daccdcd795620e37876284aa2a181b579d2ef1d9de9c6944670127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xcalib-profiles"

RDEPENDS:${PN} += ""

inherit rpm
