SUMMARY = "Scripts for KDE software development"
DESCRIPTION = "This package contains scripts useful for development of KDE software."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kdesdk-scripts-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c8e16845e306465c9e8ca51eca48536e584103a5d22f5b60f6468444a9cd21e6fe8cf5eda5b73524a87316ed60d37521e5e3ad87aafffe79e1c15d7d248195d1"

RPROVIDES:${PN} += "kde-dev-scripts \
kdesdk-scripts \
kdesdk4-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
