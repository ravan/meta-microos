SUMMARY = "An OBS source service: Update spec file version"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
Very simply script to update the version in .spec or .dsc files according to \
a given version or to the existing files."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6"

RPM_NAME = "obs-service-set_version-0.6.6-2.1.noarch.rpm"
RPM_HASH = "c5452e3aeda95953d2315115825af603b34b87f90c00a5feba023dda327f5cd2cb68f488e929f9ff565106dd7916cd7a33d2e0a6e55c65ccfd1e7ea7f49a55f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-set-version"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
