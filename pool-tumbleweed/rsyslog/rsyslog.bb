SUMMARY = "The enhanced syslogd for Linux and Unix"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslogd supporting, among others, \
MySQL, syslog/tcp, RFC 3195, permitted sender lists, filtering on any \
message part, and fine grain output format control. It is quite \
compatible to stock sysklogd and can be used as a drop-in replacement. \
Its advanced features make it suitable for enterprise-class, encryption \
protected syslog relay chains while at the same time being very easy to \
setup for the novice user."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2608.0"

RPM_NAME = "rsyslog-8.2608.0-1.1.aarch64.rpm"
RPM_HASH = "93248ceb1adc120eb5f10083145dff42d51737ef5e79f5e7c87fbafb8202258f5184f27d235a96f286d153201cdac201a99e55d598879f0576c21184320bf9a3"

RPROVIDES:${PN} += "config-rsyslog \
rsyslog \
syslog \
sysvinit-syslog"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libestr.so.0 \
libfastjson.so.4 \
liblogging-rfc3195.so.0 \
liblognorm.so.5 \
libm.so.6 \
libprotobuf-c.so.1 \
libresolv.so.2 \
libsnappy.so.1 \
libsystemd.so.0 \
libuuid.so.1 \
libyaml-0.so.2 \
libz.so.1 \
syslog-service"

inherit rpm
