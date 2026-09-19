SUMMARY = "Header and object files for frr development"
DESCRIPTION = "The frr-devel package contains the header and object files necessary for \
developing OSPF-API and frr applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "frr-devel-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "5e0983340eca6cb918da178f13a25e141d51d0094f0cbfc96573a807d38d58532d312507db51ffb3f31dc438eb5b3976b25e23bf9270e475a3c353c8e832a697"

RPROVIDES:${PN} += "frr-devel \
pkgconfig-frr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfrr-pb0 \
libfrr0 \
libfrrcares0 \
libfrrfpm-pb0 \
libfrrospfapiclient0 \
libfrrsnmp0 \
libfrrzmq0 \
libmgmt-be-nb0"

inherit rpm
