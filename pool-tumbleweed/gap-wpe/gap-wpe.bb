SUMMARY = "GAP: Wreath Product Elements"
DESCRIPTION = "WPE provides methods for working with Wreath Product Elements in the \
GAP computer algebra system."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "gap-wpe-0.8-1.6.aarch64.rpm"
RPM_HASH = "88aca8412f92bc7d5bb3d36b6c9e9da948ed367881500f2d11f7cac87cd8e85926d0f71d3f20054584ee75697cc98434f93af197a89051365af2a0fdb78fe06c"

RPROVIDES:${PN} += "gap-wpe"

RDEPENDS:${PN} += "/usr/bin/bash \
gap-core"

inherit rpm
