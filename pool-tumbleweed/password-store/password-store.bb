SUMMARY = "Utility to store, retrieve, generate and synchronize passwords"
DESCRIPTION = "With password-store, each password lives inside of a gpg encrypted file whose \
filename is the title of the website or resource that requires the password. \
These encrypted files may be organized into meaningful folder hierarchies, \
copied from computer to computer, and, in general, manipulated using standard \
command line file management utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.4"

RPM_NAME = "password-store-1.7.4-6.4.noarch.rpm"
RPM_HASH = "d249268bfee63560f6aaf17efdac8cec2e2aec349bbe6259ef0400f0d980a67674d25fb050e7de3592d536453ef7f3e8dd46b8f872af90aaef1749831dcd739b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "password-store"

RDEPENDS:${PN} += "/usr/bin/bash \
gpg2 \
qrencode \
tree"

inherit rpm
