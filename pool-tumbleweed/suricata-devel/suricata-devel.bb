SUMMARY = "Development files for the Suricata engine library"
DESCRIPTION = "The Suricata Engine is an Open Source Next Generation Intrusion Detection and \
Prevention Engine. \
 \
This package contains the development files for the Suricata engine library."
LICENSE = "GPL-2.0-only"

PV = "8.0.6"

RPM_NAME = "suricata-devel-8.0.6-1.3.aarch64.rpm"
RPM_HASH = "31f51b636b2d585735dc2ea6b056553f6e1d1ec49a692bfd83060870cede0abe3572f814b6a44884f1eab4ff78177f93209c193dd049393dcf8bb640d2057c85"

RPROVIDES:${PN} += "suricata-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libsuricata8-0-6 \
pkgconfig-jansson \
pkgconfig-libmagic"

inherit rpm
