SUMMARY = "Common server files or settings for kanku"
DESCRIPTION = "This package contains common server files, settings and dependencies \
for the kanku server components like kanku-worker, kanku-dispatcher, \
kanku-web, kanku-scheduler and kanku-triggerd."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-common-server-1.0.0-2.2.noarch.rpm"
RPM_HASH = "100b6eec40ee7125951fd26887ac95f2f31086c18d9cf8f39d5bd6e3ba06b2ec2a1dc450f03f6fcb4670f21afaf4bcd145e54f35e9d4609c5bb20a7fd3f416c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-kanku-common-server \
kanku-common-server"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kanku \
libvirt-daemon \
libvirt-daemon-driver-qemu \
shadow \
user-kankurun"

inherit rpm
