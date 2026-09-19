SUMMARY = "Enable reproducible builds"
DESCRIPTION = "Installing this package tweaks the build process \
to create reproducible packages."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "suse-reproducible-builds-1.0-1.2.noarch.rpm"
RPM_HASH = "40aa192b607d85eeec3e4ff1d4fede28696fecd8716975faabbee53104060c80bc91bc1aee024cd7e0b637d5ade9a97fa294bb2af46492aa6a3e8db356f3efd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro--buildhost \
rpm-macro-build-mtime-policy \
rpm-macro-use-source-date-epoch-as-buildtime \
rpm-macro-want-reproducible-builds \
suse-reproducible-builds"

RDEPENDS:${PN} += ""

inherit rpm
