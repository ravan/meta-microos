SUMMARY = "Development tools for input-pad"
DESCRIPTION = "The input-pad-devel package contains the header files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20210817"

RPM_NAME = "input-pad-devel-1.0.99.20210817-1.8.aarch64.rpm"
RPM_HASH = "667ebd6d58cf9f1a518064f1438918c13b95a5e0ccf0005bf4ca36743575651bb4831a39b1622dc576a291c7fecbf14b367e2cb9c6fdff28e96b0746eb99e7af"

RPROVIDES:${PN} += "input-pad-devel \
pkgconfig-input-pad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
input-pad \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
