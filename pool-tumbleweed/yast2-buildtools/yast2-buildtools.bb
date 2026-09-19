SUMMARY = "Minimal set of tools needed to build yast module"
DESCRIPTION = "Scripts and templates required for rebuilding the existing YaST2 \
modules and components (both ruby and C++)."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.4"

RPM_NAME = "yast2-buildtools-5.0.4-1.1.noarch.rpm"
RPM_HASH = "61b30b0d8f1c2d5015a19ead89797cfd96972c9463f5d41a216aee011e7fc9432c7d61f85c0fd55a1744e7ac5e80e8dceca948ef2c855682f3dc236a9a683ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-yast2-devtools \
rpm-macro-yast-agentdir \
rpm-macro-yast-build \
rpm-macro-yast-check \
rpm-macro-yast-ci-check \
rpm-macro-yast-clientdir \
rpm-macro-yast-configure \
rpm-macro-yast-controldir \
rpm-macro-yast-desktopdir \
rpm-macro-yast-dir \
rpm-macro-yast-docdir \
rpm-macro-yast-execcompdir \
rpm-macro-yast-fillupdir \
rpm-macro-yast-icondir \
rpm-macro-yast-imagedir \
rpm-macro-yast-includedir \
rpm-macro-yast-install \
rpm-macro-yast-libdir \
rpm-macro-yast-localedir \
rpm-macro-yast-logdir \
rpm-macro-yast-metainfo \
rpm-macro-yast-metainfodir \
rpm-macro-yast-moduledir \
rpm-macro-yast-plugindir \
rpm-macro-yast-prep \
rpm-macro-yast-schemadir \
rpm-macro-yast-scrconfdir \
rpm-macro-yast-themedir \
rpm-macro-yast-vardir \
rpm-macro-yast-ybindir \
rpm-macro-yast-ydatadir \
rpm-macro-yast-yncludedir \
rpm-macro-yast-ystartupdir \
yast2-buildtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/pkg-config \
/usr/bin/sh \
autoconf \
automake \
gettext-tools \
perl \
perl-XML-Writer \
pkgconfig"

inherit rpm
