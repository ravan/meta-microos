SUMMARY = "Statistics Collection Daemon for filling RRD Files"
DESCRIPTION = "collectd is a daemon (written in C) that reads various system \
statistics and updates RRD files. Statistics are very fine grained \
with an update interval of 10 seconds."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "887c74b8d8f33406c05613a1a5b8fee1327ccbb0c895bbe4566475c5e9592b47c626f8a01dafd7a038b93c52932c72fb47ca8f855f7c38ee1e2ecb60317f58df"

RPROVIDES:${PN} += "collectd \
collectd-beta \
config-collectd \
perl-Collectd \
perl-Collectd--Plugins--OpenVZ \
perl-Collectd--Unixsock"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcollectdclient.so.1 \
libcurl.so.4 \
libesmtp.so.6.2.0 \
libgcrypt.so.20 \
libip4tc.so.2 \
libip6tc.so.2 \
libjansson.so.4 \
libm.so.6 \
libmicrohttpd.so.12 \
libmnl.so.0 \
liboping.so.0 \
libpcap.so.1 \
libperl.so \
libprotobuf-c.so.1 \
librrd.so.8 \
libsensors.so.4 \
libudev.so.1 \
libxml2.so.16 \
libyajl.so.2 \
rrdtool \
sensors \
systemd"

inherit rpm
