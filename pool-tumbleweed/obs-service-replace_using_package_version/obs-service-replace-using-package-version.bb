SUMMARY = "An OBS service: Replaces a regex  with the version value of a package"
DESCRIPTION = "This service replaces a given regex with the version value of \
a given package. Can be used to align the version of you package or image \
to the version of another package."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.13"

RPM_NAME = "obs-service-replace_using_package_version-0.0.13-1.1.noarch.rpm"
RPM_HASH = "db7874019776156904013698eb25a6929333f790ef9321345239d1cd2bc915e49e22df3cc1e31c5eff7282894e7443ad68ccf4c3730a28a46017567d3827584c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-replace-using-package-version"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-base \
python3-docopt \
python3-rpm"

inherit rpm
