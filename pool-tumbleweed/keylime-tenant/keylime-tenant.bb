SUMMARY = "Keylime tenant command line tool"
DESCRIPTION = "Subpackage of keylime for tenant command line tool."
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "keylime-tenant-7.14.3-1.1.noarch.rpm"
RPM_HASH = "5093babfe9d95e153416be543d98600e93befa2262c830d1ccab4b4d0ef415fea3f0a8c0e76c29b98e273625ab4d0ecb5a4d7f8e8a683a45b0228f59d4dc2e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-tenant"

RDEPENDS:${PN} += "group-tss \
keylime-config \
keylime-tpm-cert-store \
python3-keylime \
user-keylime"

inherit rpm
