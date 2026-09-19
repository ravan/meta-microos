SUMMARY = "The logcom service for pagure"
DESCRIPTION = "pagure-logcom contains the service that logs commits into the database so that \
the activity calendar heatmap is filled."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-logcom-5.14.1-3.3.noarch.rpm"
RPM_HASH = "e8b4134e27b890190797d55fde812c067721f38c4f3e29ace03d0677fd055753e98c5e3e9441d73a9c4a3b0764d714e414b82c1068adbc446defd1fe6470840e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-logcom"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm
