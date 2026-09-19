SUMMARY = "Libraries and include files for developing with R-base"
DESCRIPTION = "This package provides the necessary development headers and \
libraries to allow you to devel with R-base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-core-devel-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "94cfcc238bb457870166e6c0ea8b4db905f640900f1a62abd9da32fdf2ffbf28d98295cebb2456cb1322b05e454ccedfeb96efb041a7b6a95450b8ef84de43f7"

RPROVIDES:${PN} += "R-core-devel \
R-devel \
R-devel-macros \
config-R-core-devel \
pkgconfig-libR \
rpm-macro-R-archlib \
rpm-macro-R-install \
rpm-macro-R-noarchlib \
rpm-macro-R-rpmver \
rpm-macro-R-test \
rpm-macro-R-unpack \
rpm-macro-R-version"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
R-base"

inherit rpm
