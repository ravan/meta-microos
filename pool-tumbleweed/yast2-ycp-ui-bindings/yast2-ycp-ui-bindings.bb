SUMMARY = "YaST2 - YCP Bindings for the YaST2 User Interface Engine"
DESCRIPTION = "This package makes the generic YaST2 user interface engine available \
for YCP applications (YCP is the scripting language in which most YaST2 \
modules are written)."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-ycp-ui-bindings-5.0.1-1.8.aarch64.rpm"
RPM_HASH = "20e49dbe1f25e89c119f86095a26f44876a19149d2a5ff121f6327fdc5103e150e2b7b9e550eb5ee9369248aca86f1a4e386ccbe5656895b9a6a7d3f48387ead"

RPROVIDES:${PN} += "libpy2UI.so.2 \
yast2-ycp-ui-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
libyui.so.16 \
libyui16 \
yast2-core"

inherit rpm
