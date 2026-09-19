SUMMARY = "GSM utilities from the osmocore project"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
This package contains a program for frequency calculation for GSM \
called 'osmo-arfcn', and a program called 'osmo-auc-gen' that is used \
for testing GSM authentication."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only & GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmocore-tools-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "0888fd7cf2d42032b91ade19fba9d64c8348a32ec892c800249b8f7da6dfcee9967a2bcca5659f0edc48fcf8721e506f33488c72246ea5c2a8005e30e4c9ab89"

RPROVIDES:${PN} += "libosmocore-tools \
libosmocore-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libosmogsm.so.20 \
libtalloc.so.2"

inherit rpm
