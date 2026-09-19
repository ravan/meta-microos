SUMMARY = "Utility to convert file names between encodings"
DESCRIPTION = "convmv is meant to convert the filenames in a directory tree or a \
whole file system into a different encoding, with support for \
symlinks. \
 \
This is useful for converting from old 8-bit locales to UTF-8. It is \
also possible to convert directories to UTF-8 that are already partly \
UTF-8 encoded. \
 \
convmv can convert names to both the NFC and NFD normalization forms. \
NFC is commonly used on Linux and (most?) other Unix-like OSes, \
though it does not enforce it. Darwin, the base of Macintosh OS X, \
enforces Normalization Form Canonical Decomposition (NFD)."
LICENSE = "GPL-2.0-or-later"

PV = "2.06"

RPM_NAME = "convmv-2.06-1.5.noarch.rpm"
RPM_HASH = "47a82ea239212b7fa992104359e520465e0f45202025a10a1c62b7016c8ecd3f8e6cbae7e3b9e2a8bee2fe030de717b13220a5e2bd12c6d19c4e57537a35b085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "convmv"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
