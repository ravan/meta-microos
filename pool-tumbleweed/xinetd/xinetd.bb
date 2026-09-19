SUMMARY = "An 'inetd' with Expanded Functionality"
DESCRIPTION = "xinetd takes the abilities of inetd and appends additional \
functionality: \
- Access Control \
- Prevention of 'denial of access' attacks \
- Extensive logging abilities \
- Clear configuration file"
LICENSE = "xinetd"

PV = "2.3.15.4"

RPM_NAME = "xinetd-2.3.15.4-3.6.aarch64.rpm"
RPM_HASH = "2b75968047eddba6fb1a108dd350ffcd5a4fb6ab0cafcb7a45a31675353799462baa20e4aa6590653a9162d8f2bd70b1c8024a338bc3fdd47d9871b5d201e269"

RPROVIDES:${PN} += "config-xinetd \
inet-daemon \
xinetd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libtirpc.so.3 \
libwrap.so.0 \
systemd"

inherit rpm
