SUMMARY = "Dynamic linker configuration for the SHERPA-MC libraries"
DESCRIPTION = "Contains the ld.so.conf.d file for the SHERPA-MC libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.2.16"

RPM_NAME = "libSHERPA-MC0-config-2.2.16-1.5.noarch.rpm"
RPM_HASH = "1a26441e48164a21ae689b2e43799f8f0b8959590760a866f06f255e34330d052a25471c6e84a0be3820c4e7ac5d73523fdf291723c7468134892af400ee008d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libSHERPA-MC0-config \
libSHERPA-MC-config \
libSHERPA-MC0-config"

RDEPENDS:${PN} += ""

inherit rpm
