SUMMARY = "Development files for Allegro's logg"
DESCRIPTION = "This package is needed to build programs that use Allegro's logg."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liblogg44-devel-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "8a11082e10a503566a45e4f74cbd0847d9d59db41927b1d24dba55ccbdca20525d48d7a88d96684050baca3964617af1cf2593e59704f55e1ce3479f3b78ca40"

RPROVIDES:${PN} += "liblogg-devel \
liblogg44-devel \
pkgconfig-logg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblogg4-4 \
pkgconfig-allegro"

inherit rpm
