SUMMARY = "Additional Package Documentation for libxklavier"
DESCRIPTION = "This library allows you to simplify XKB-related development."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier-doc-5.4-2.11.aarch64.rpm"
RPM_HASH = "6e99465c70a4020b33c1baf2919e3a7a248aa36d221ad827473638821736da95d82fed3dc70530d5a2ce40728541f1e710fbd8282e759c1ae2c18ac3cacdc3d3"

RPROVIDES:${PN} += "libxklavier-doc"

RDEPENDS:${PN} += "libxklavier"

inherit rpm
