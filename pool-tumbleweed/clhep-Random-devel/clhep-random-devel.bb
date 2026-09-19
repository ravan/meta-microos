SUMMARY = "Headers and sources for development with CLHEP Random library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP Random library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Random-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "372720f1140cac3854277c3803b50e06b1196da17aa8fd17ff3afd07a2c8d58bf8355cdeafbc85660ac05b319318002f85c8cfcbec545ba5457131f787038dbe"

RPROVIDES:${PN} += "clhep-Random-devel \
pkgconfig-clhep-random"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
clhep-Units-devel \
clhep-Utility-devel \
libCLHEP-Random-2-4-7-2"

inherit rpm
