SUMMARY = "Userspace utilities for fs-verity"
DESCRIPTION = "fsverity is a userspace utility for fs-verity. fs-verity is a Linux \
kernel filesystem feature that does transparent on-demand verification \
of the contents of read-only files using Merkle trees. \
 \
fsverity can enable fs-verity on files, retrieve the digests of \
fs-verity files, and sign files for use with fs-verity (among other \
things). fsverity's functionality is divided among various subcommands."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "fsverity-utils-1.7-1.3.aarch64.rpm"
RPM_HASH = "2a5b6964c23e4799dd419f5544599937f0aaf77123466b72cc065912d0ea341f8a5010fe28fc158c90cc4a3bb5fca46da32359d7f3001e018a73c6d96b187090"

RPROVIDES:${PN} += "fsverity-utils"

RDEPENDS:${PN} += "libc.so.6 \
libfsverity.so.0"

inherit rpm
