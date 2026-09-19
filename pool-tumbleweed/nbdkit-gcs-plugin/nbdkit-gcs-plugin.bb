SUMMARY = "Gooogle Cloud Storage plugin nbdkit"
DESCRIPTION = "This package lets you open disk images stored in Google Cloud Storage \
using nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-gcs-plugin-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "c4d3f458e4b285a223343c54b496ef156d4fcde742ec49572ac23c3227e0d4ffe8f80797261218e4e1a92df25e56dd9237d8a5823d6b6425f09d8a4ba3fa183d"

RPROVIDES:${PN} += "nbdkit-gcs-plugin"

RDEPENDS:${PN} += "/usr/sbin/nbdkit \
nbdkit-python-plugin \
nbdkit-server \
python3-google-cloud-storage"

inherit rpm
