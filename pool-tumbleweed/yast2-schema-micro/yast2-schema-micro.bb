SUMMARY = "YaST2 - AutoYaST Schema (micro variant)"
DESCRIPTION = "AutoYaST Syntax Schema (micro variant)"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.3"

RPM_NAME = "yast2-schema-micro-5.0.3-1.6.aarch64.rpm"
RPM_HASH = "6004a9ad6cd471b1e7426d229dfa98645eacb298bd608a69fe8dc870add658b0992216dbe9be613152d297edb255bc19c1c9e097c715aa2e976eef2dd6074460"

RPROVIDES:${PN} += "yast2-schema \
yast2-schema-micro"

RDEPENDS:${PN} += ""

inherit rpm
