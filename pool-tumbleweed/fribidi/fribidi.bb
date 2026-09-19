SUMMARY = "An implementation of the Unicode BiDi algorithm"
DESCRIPTION = "This library implements the algorithm as described in 'Unicode \
Standard Annex #9, the Bidirectional Algorithm'."
LICENSE = "LGPL-2.1-only"

PV = "1.0.16"

RPM_NAME = "fribidi-1.0.16-1.3.aarch64.rpm"
RPM_HASH = "95e1a104e912b8c7facf760b0dddb017120f9e792734667a4b6e874d87928de30156ed5c04c80ad2e4a17cd3de3c621890017f7fa250b87cd3d4962b826919a2"

RPROVIDES:${PN} += "fribidi \
locale-ar;he"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfribidi.so.0"

inherit rpm
