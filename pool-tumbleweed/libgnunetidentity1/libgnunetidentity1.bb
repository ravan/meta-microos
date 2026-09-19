SUMMARY = "GNUnet library libgnunetidentity"
DESCRIPTION = "This package contains the libgnunetidentity library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetidentity1-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "1b3dd0ec35300b641b7bfe0930ef79ef6a732beff49b747f35699e636d05e2d3ad2e820325314d47e0dc9915efed6db5b9bc87a3134f586f36da4ee8548bdef2"

RPROVIDES:${PN} += "libgnunetidentity.so.1 \
libgnunetidentity1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
