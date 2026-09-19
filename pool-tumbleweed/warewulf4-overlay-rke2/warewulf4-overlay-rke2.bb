SUMMARY = "Configuration template for RKE2"
DESCRIPTION = "This package provides a template that is used to share a connection token \
and server endpoint information across an RKE2 cluster."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "warewulf4-overlay-rke2-4.7.0-4.1.noarch.rpm"
RPM_HASH = "587dbfe45f322c5f80c05428325df735f71eb44ca0f56f11afecbdd49ce7abc4a5de323e9a91d243bb049a81ae695ae0768836f0bd55f1a62691ea90ed39c6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf4-overlay-rke2"

RDEPENDS:${PN} += "slurm \
warewulf4"

inherit rpm
