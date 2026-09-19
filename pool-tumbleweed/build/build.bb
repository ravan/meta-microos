SUMMARY = "A Script to Build SUSE Linux RPMs"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot environment."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20260505"

RPM_NAME = "build-20260505-1.3.noarch.rpm"
RPM_HASH = "5bad7e27f7ef9d6d95a6099884c921cd6ff2d9154e29e46674c59e04592b9e07b2376db4536ef3a44bdeb4b75f306c3f474efbd1fb0dac99af76bdfadc9eac8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build \
config-build \
perl-Build \
perl-Build--Apk \
perl-Build--Apkrepo \
perl-Build--Apkv3 \
perl-Build--Appimage \
perl-Build--Arch \
perl-Build--Archrepo \
perl-Build--Collax \
perl-Build--Deb \
perl-Build--Debrepo \
perl-Build--Docker \
perl-Build--Download \
perl-Build--ELF \
perl-Build--Expand \
perl-Build--Features \
perl-Build--Fissile \
perl-Build--Flatpak \
perl-Build--Helm \
perl-Build--Intrepo \
perl-Build--IntrospectGolang \
perl-Build--IntrospectRust \
perl-Build--Kiwi \
perl-Build--LiveBuild \
perl-Build--Mdkrepo \
perl-Build--Mkosi \
perl-Build--Modulemd \
perl-Build--Modules \
perl-Build--Options \
perl-Build--ProductCompose \
perl-Build--Repo \
perl-Build--Rpm \
perl-Build--Rpmmd \
perl-Build--SPDX \
perl-Build--SimpleJSON \
perl-Build--SimpleXML \
perl-Build--SimpleYAML \
perl-Build--Snapcraft \
perl-Build--Susetags \
perl-Build--Zypp \
perl-PBuild--AssetMgr \
perl-PBuild--BearerAuth \
perl-PBuild--BuildResult \
perl-PBuild--Cando \
perl-PBuild--Checker \
perl-PBuild--Container \
perl-PBuild--Cpio \
perl-PBuild--Depsort \
perl-PBuild--Distro \
perl-PBuild--Expand \
perl-PBuild--ExportFilter \
perl-PBuild--Job \
perl-PBuild--Link \
perl-PBuild--LocalRepo \
perl-PBuild--Manifest \
perl-PBuild--Meta \
perl-PBuild--Mkosi \
perl-PBuild--Modules \
perl-PBuild--Multibuild \
perl-PBuild--OBS \
perl-PBuild--Options \
perl-PBuild--Preset \
perl-PBuild--Recipe \
perl-PBuild--RemoteAssets \
perl-PBuild--RemoteRegistry \
perl-PBuild--RemoteRepo \
perl-PBuild--RepoMgr \
perl-PBuild--Repoquery \
perl-PBuild--Result \
perl-PBuild--Service \
perl-PBuild--SigAuth \
perl-PBuild--Source \
perl-PBuild--Structured \
perl-PBuild--Util \
perl-PBuild--Verify \
perl-PBuild--Zip"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bash \
binutils \
build-mkbaselibs \
findutils \
perl \
perl-POSIX \
psmisc \
tar"

inherit rpm
