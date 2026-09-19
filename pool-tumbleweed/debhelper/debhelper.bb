SUMMARY = "Helper programs for debian/rules"
DESCRIPTION = "A collection of programs that can be used in a debian/rules file to \
automate common tasks related to building debian packages. Programs \
are included to install various files into your package, compress \
files, fix file permissions, integrate your package with the debian \
menu system, debconf, doc-base, etc. Most debian packages use debhelper \
as part of their build process."
LICENSE = "GPL-2.0-or-later"

PV = "14.3"

RPM_NAME = "debhelper-14.3-1.2.noarch.rpm"
RPM_HASH = "afacbf7b9d8c17f2a2c06b9803b5e09042f7c3ed2db5f32544142b789b83e30697684f255b6934391c16f4ee458e0053f55ce255db52f33159a835b38373f4aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb-/usr/bin/dh-install \
debhelper \
perl-Debian--Debhelper--Buildsystem \
perl-Debian--Debhelper--Buildsystem--ant \
perl-Debian--Debhelper--Buildsystem--autoconf \
perl-Debian--Debhelper--Buildsystem--cmake \
perl-Debian--Debhelper--Buildsystem--makefile \
perl-Debian--Debhelper--Buildsystem--meson \
perl-Debian--Debhelper--Buildsystem--ninja \
perl-Debian--Debhelper--Buildsystem--perl-build \
perl-Debian--Debhelper--Buildsystem--perl-makemaker \
perl-Debian--Debhelper--Buildsystem--python-distutils \
perl-Debian--Debhelper--Buildsystem--qmake \
perl-Debian--Debhelper--Buildsystem--qmake6 \
perl-Debian--Debhelper--DH--AddonAPI \
perl-Debian--Debhelper--DH--SequenceState \
perl-Debian--Debhelper--Dh-Buildsystems \
perl-Debian--Debhelper--Dh-Getopt \
perl-Debian--Debhelper--Dh-Lib \
perl-Debian--Debhelper--Dh-Version \
perl-Debian--Debhelper--Sequence \
perl-Debian--Debhelper--SequencerUtil"

RDEPENDS:${PN} += "/usr/bin/perl \
dh-autoreconf \
dpkg \
perl \
strip-nondeterminism"

inherit rpm
