SUMMARY = "Filesystem interface over GCS - FUSE interface"
DESCRIPTION = "File-system interface for Google Cloud Storage. \
 \
This package provides the optional FUSE interface."
LICENSE = "BSD-3-Clause"

PV = "2026.5.0"

RPM_NAME = "python313-gcsfs-fuse-2026.5.0-1.2.noarch.rpm"
RPM_HASH = "c67e5e638f1182094504e79f93e3936d4d97131b2c139f785132827ac9ebecab84088b8b2b16637044f786255d40aaaede23cec96ed4169f18380de917274438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gcsfs-fuse \
python313-gcsfs-fuse"

RDEPENDS:${PN} += "python-abi \
python313-click \
python313-fusepy"

inherit rpm
