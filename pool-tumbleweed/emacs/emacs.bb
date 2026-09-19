SUMMARY = "GNU Emacs Base Package"
DESCRIPTION = "Basic package for the GNU Emacs editor.  For a documentation see https://www.emacsdocs.org/. \
This package requires emacs-x11 and/or emacs-nox to have the GNU Emacs editor its self."
LICENSE = "GPL-3.0-or-later"

PV = "31.1"

RPM_NAME = "emacs-31.1-3.1.aarch64.rpm"
RPM_HASH = "fa4fc9d42f97f7221b74426742d939eb472b704a6e61fd26e8eea02eb8347ef9052bb584e2be90a0d0a1d29ca8776476b86a51d9dd54648987bec17e3ab5c641"

RPROVIDES:${PN} += "config-emacs \
emacs \
emacs-ELPA \
epg \
nxml-mode"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
emacs-info \
emacs-program \
etags \
fileutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
mailutils"

inherit rpm
