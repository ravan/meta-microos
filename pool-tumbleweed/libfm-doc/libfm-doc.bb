SUMMARY = "GTK libfm libraries"
DESCRIPTION = "libfm developers documentation"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libfm-doc-1.4.1-2.5.aarch64.rpm"
RPM_HASH = "474360fe7bf9950edd34f7f440e6002b6ada85b345e0ea4b9e75932a8bd26ad5d6c6a090a28b329ad33b810ef84c5ee34add19b159ab800e2a826227a3a2e142"

RPROVIDES:${PN} += "libfm-doc"

RDEPENDS:${PN} += "libfm"

inherit rpm
