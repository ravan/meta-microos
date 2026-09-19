SUMMARY = "Filesystem interface over GCS - FUSE interface"
DESCRIPTION = "File-system interface for Google Cloud Storage. \
 \
This package provides the optional FUSE interface."
LICENSE = "BSD-3-Clause"

PV = "2026.5.0"

RPM_NAME = "python314-gcsfs-fuse-2026.5.0-1.2.noarch.rpm"
RPM_HASH = "028a345dcc7238d3538e1f81d86729e7354881f6bfca5582591700d466dac40a4eb23d6d332e7688f04d505b0181c02b1dcaa65c5da3a0f2be802fa873b9fd91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-gcsfs-fuse"

RDEPENDS:${PN} += "python-abi \
python314-click \
python314-fusepy"

inherit rpm
