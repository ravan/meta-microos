SUMMARY = "YaST2 - Agent for Various Transfer Protocols"
DESCRIPTION = "A YaST2 Agent for various Transfer Protocols: FTP, HTTP, and TFTP."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-transfer-5.0.1-1.2.aarch64.rpm"
RPM_HASH = "dc90cdf87e92ad0e8496a89c9a11eadfffe48e0fdc0040bd81d25c493c86840b502bb77be65ac87b6b55a2f4eee8d16da300aaa02353de4266837ac6b3f3990b"

RPROVIDES:${PN} += "libpy2ag-curl.so.2 \
libpy2ag-tftp.so.2 \
yast2-agent-curl \
yast2-agent-curl-devel \
yast2-agent-tftp \
yast2-agent-tftp-devel \
yast2-transfer"

RDEPENDS:${PN} += "curl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2-ruby-bindings"

inherit rpm
