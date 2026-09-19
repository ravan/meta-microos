SUMMARY = "YaST2 - Network Booting and Wake-On-Lan Configuration"
DESCRIPTION = "YaST2 module for network booting and Wake-On-Lan."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-boot-server-5.0.1-1.2.noarch.rpm"
RPM_HASH = "e730f64f20fc2add1e99ed3cc5f41e6d1bd2ec31ae12ac9968cadd3929fa9cfd0f30331725e6714e00ce59eb1d69ab8abdc10fd564272df19cf1ff5a984036b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-boot-server"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
