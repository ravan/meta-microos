SUMMARY = "Prometheus exporter for ICMP echo requests"
DESCRIPTION = "This is a simple server that scrapes go-ping stats and exports them via HTTP \
for Prometheus consumption."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "golang-github-czerwonk-ping_exporter-1.1.4-1.8.aarch64.rpm"
RPM_HASH = "7e5654ba562e93fbb8ba5e55be0c7e1593b59ca69c081906ca848749b91f7cf3ba76a90f6127c14dc0cb39a8819370762b8ae1db0fedf0e738715d3fac12044a"

RPROVIDES:${PN} += "config-golang-github-czerwonk-ping-exporter \
golang-github-czerwonk-ping-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6"

inherit rpm
