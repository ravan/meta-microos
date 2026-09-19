SUMMARY = "An undelete tool for the XFS filesystem"
DESCRIPTION = "xfs_undelete tries to recover all files on an XFS filesystem marked as \
deleted. You may also specify a date or age since deletion, and file types \
to ignore or to recover exclusively."
LICENSE = "GPL-3.0-only"

PV = "15.0"

RPM_NAME = "xfs_undelete-15.0-2.5.noarch.rpm"
RPM_HASH = "55fb467d5599b6c3013f391a4767a40377bfb569732ed9ab2651c842d9cf520eca1c67d4f8dd824ffba5547d29891c1c26c42f2bde3e36bcf04724c6bff4d459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfs-undelete"

RDEPENDS:${PN} += "/usr/bin/tclsh \
coreutils \
file \
file-magic \
tcl \
tcllib"

inherit rpm
