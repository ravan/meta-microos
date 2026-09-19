SUMMARY = "Polyinstantiated /media Directory"
DESCRIPTION = "The Filesystem Hierarchy Standard defines /media as a directory for removable \
media. This package provides an udisks compatible /media directory."
LICENSE = "CC0-1.0"

PV = "0.1"

RPM_NAME = "filesystem-media-0.1-1.12.noarch.rpm"
RPM_HASH = "848b1b7885965ed19a3e7de979438a8c81e4488a6bf4425c776fca2124a68d12423591a27fc52c0a89a86d34ae6253464ceb98a41081aa68269b4b58f7a1da36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "filesystem-media"

RDEPENDS:${PN} += "/usr/bin/sh \
acl \
pam"

inherit rpm
