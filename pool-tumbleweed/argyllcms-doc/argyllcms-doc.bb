SUMMARY = "Argyll CMS documentation"
DESCRIPTION = "The Argyll color management system supports accurate ICC profile creation for \
scanners, CMYK printers, film recorders and calibration and profiling of \
displays. \
 \
This package contains the Argyll color management system documentation."
LICENSE = "AGPL-3.0-only & GPL-2.0-or-later & MIT"

PV = "3.4.1"

RPM_NAME = "argyllcms-doc-3.4.1-1.7.noarch.rpm"
RPM_HASH = "516ace2d2ce22546ca919d20e1f7f78b816bdb16bde991b33e9ba9494d3f4cdcf9d623467f6b3905a7891b404d3cc5a234cdb430052ca68514603ac306d526e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argyllcms-doc"

RDEPENDS:${PN} += "argyllcms"

inherit rpm
