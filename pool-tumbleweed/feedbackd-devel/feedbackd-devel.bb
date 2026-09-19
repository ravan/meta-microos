SUMMARY = "Development files for feedbackd"
DESCRIPTION = "The feedbackd-devel package contains libraries and header files for \
developing applications that use feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.8.9"

RPM_NAME = "feedbackd-devel-0.8.9-1.3.aarch64.rpm"
RPM_HASH = "d0c33d18aad099f37ed1802cc0e79c9f24ec2301d8dc0f4069184edd76de77a9d1711a57c47588f75f70eeda1df142a47c3acba0aac1d4c6c1355a77e9ffdb53"

RPROVIDES:${PN} += "feedbackd-devel \
pkgconfig-libfeedback-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
feedbackd \
libfeedback-0-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Lfb-0-0"

inherit rpm
