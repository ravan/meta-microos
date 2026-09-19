SUMMARY = "Allegro DGA2 (Direct Graphics Access) plugin"
DESCRIPTION = "This package contains a DGA2 (Direct Graphics Access) driver for Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "allegro44-dga2-plugin-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "8e7ba3ad83de8115d65fc5737efa12903e22324ed6c5c5f5d6962af79167bfc5efc8c63be1f56244ae80572d669d45c9a142e5b9f325c5d0b5d9a38d56639050"

RPROVIDES:${PN} += "allegro44-dga2-plugin"

RDEPENDS:${PN} += "allegro44 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86dga.so.1 \
liballeg.so.4.4 \
libc.so.6"

inherit rpm
