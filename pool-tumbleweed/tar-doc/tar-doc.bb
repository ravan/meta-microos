SUMMARY = "Documentation files for GNU tar"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.35"

RPM_NAME = "tar-doc-1.35-10.1.noarch.rpm"
RPM_HASH = "7fc1dc9cc8aea575a49df932a4eefda3ee04da81076af90f55a1f9d7783218ed0c3d8f6c27a2d8f345148567a8a0b1f80f5c689e4295a832c6c0091bf10cc99e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tar-doc"

RDEPENDS:${PN} += "tar"

inherit rpm
