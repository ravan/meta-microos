SUMMARY = "Development pkg for the slop library"
DESCRIPTION = "Development files for the slop library."
LICENSE = "GPL-3.0-or-later"

PV = "7.7"

RPM_NAME = "slop-devel-7.7-1.6.aarch64.rpm"
RPM_HASH = "378c870fcf006c6ab477e41db5a8378a9b4706408d3e537762a03b672772e854af85fd0fab437a490b05fb015eec9424358dd9e445c6322720b132f2bd7205c4"

RPROVIDES:${PN} += "slop-devel"

RDEPENDS:${PN} += "libslopy7-7"

inherit rpm
