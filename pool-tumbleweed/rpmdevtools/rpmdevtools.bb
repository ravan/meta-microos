SUMMARY = "RPM Development Tools"
DESCRIPTION = "This package contains scripts and (X)Emacs support files to aid in \
development of RPM packages. \
rpmdev-setuptree    Create RPM build tree within user's home directory \
rpmdev-diff         Diff contents of two archives \
rpmdev-newspec      Creates new .spec from template \
rpmdev-rmdevelrpms  Find (and optionally remove) 'development' RPMs \
rpmdev-checksig     Check package signatures using alternate RPM keyring \
rpminfo             Print information about executables and libraries \
rpmdev-md5/sha*     Display checksums of all files in an archive file \
rpmdev-vercmp       RPM version comparison checker \
spectool            Expand and download sources and patches in specfiles \
rpmdev-wipetree     Erase all files within dirs created by rpmdev-setuptree \
rpmdev-extract      Extract various archives, 'tar xvf' style \
rpmdev-bumpspec     Bump revision in specfile \
...and many more."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "8.10"

RPM_NAME = "rpmdevtools-8.10-7.18.noarch.rpm"
RPM_HASH = "3982536f2f1fbc57186b63571bc39d690a5d3953260b5899020aa68092a6ddc3d8529f0e9c8d41594a6a779d4269ca2d42ad40d0a528e0918b1b3a0ad00aad7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmdevtools \
rpmdevtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
bash-completion \
cpio \
curl \
distribution-release \
fakeroot \
python3-rpm"

inherit rpm
