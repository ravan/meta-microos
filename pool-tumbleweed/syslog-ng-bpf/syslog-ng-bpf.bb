SUMMARY = "Faster UDP log collection for syslog-ng"
DESCRIPTION = "This package provides faster UDP log collection for syslog-ng using bpf"
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-bpf-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "13735bdc0283e1eee0078b6230cf7652cdd562fe651aa0fac0203ea93ac6023b9fd3fa181ff71ff993073e8ab3a80c4fd0b6f707b2aec78498260a8678e1ee69"

RPROVIDES:${PN} += "syslog-ng-bpf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
