SUMMARY = "Development files for rsyslog"
DESCRIPTION = "The rsyslog-devel package includes header files, libraries necessary for \
developing the rsyslog logging daemon."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-devel-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "97eb514ad64ef3ef4f45f24f2fcae707e15279c8fb2d276bf6f6e7f9a955afd78d3cfaec678f048b1a946119c7909b95d82bfce5858419df4b87d6fdc2a2b1cf"

RPROVIDES:${PN} += "rsyslog-devel"

RDEPENDS:${PN} += "glibc-devel \
krb5-devel \
libbrotli-devel \
libestr-devel \
libfastjson-devel \
libgcrypt-devel \
liblognorm-devel \
libmariadb-devel \
libnet-devel \
libnl3-devel \
librelp-devel \
libzstd-devel \
linux-glibc-devel \
net-snmp-devel \
postgresql18-devel-mini \
zlib-devel"

inherit rpm
