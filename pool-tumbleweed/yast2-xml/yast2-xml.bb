SUMMARY = "YaST2 - XML Agent"
DESCRIPTION = "The YaST2 XML agent"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "yast2-xml-5.0.1-1.5.aarch64.rpm"
RPM_HASH = "66449c27aa986d2aea9c601537b2114d36e07ff6c28e4777b19b38582224d40ec09c4082d657257bab6a785ea44fb3289aaf0d068c80af60754f1b5065f6e8ab"

RPROVIDES:${PN} += "libpy2ag-xml.so.2 \
yast2-agent-xml \
yast2-agent-xml-devel \
yast2-lib-xml \
yast2-xml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscr.so.3 \
libstdc++.so.6 \
liby2util.so.5 \
libycpvalues.so.6 \
yast2-core"

inherit rpm
