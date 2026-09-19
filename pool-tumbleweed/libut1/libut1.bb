SUMMARY = "Library for assisting in URI construction from templates"
DESCRIPTION = "This package provides the shared library libut from opendkim which \
assists in URI construction from templates."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "libut1-2.11.0-13.5.aarch64.rpm"
RPM_HASH = "018a6532ff447a337bc7ae74ff9153ae933050d8e086cb5f31a3ace56a9790aa11aaf40a538dd3d71283d239a1c2ab1129a134d9beec78168dbb7c7f86c6619f"

RPROVIDES:${PN} += "config-libut1 \
libut.so.1 \
libut1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
