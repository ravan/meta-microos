SUMMARY = "Name maps for libnl"
DESCRIPTION = "This package contains configuration files for libnl and programs using \
the same; in particular \
- name maps for class-ids -- class-names (like /etc/services) \
- aliases for locations within a packet (ip6.dst => byte offset)"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.12.0"

RPM_NAME = "libnl-config-3.12.0-1.5.noarch.rpm"
RPM_HASH = "c33710582996d38bea5e40e345100cd16dd20406085759637bcc3580d5244f2063c5b1b801c167a593abc1ea7d4d8bb42f72685448191678a1b39215ef35ab95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libnl-config \
libnl-config"

RDEPENDS:${PN} += ""

inherit rpm
