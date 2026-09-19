SUMMARY = "GAP: GRaph Algorithms using PErmutation groups"
DESCRIPTION = "GRAPE is a package for computing with graphs and groups, and is \
primarily designed for constructing and analysing graphs related to \
groups, finite geometries, and designs."
LICENSE = "GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "gap-grape-4.9.3-1.4.noarch.rpm"
RPM_HASH = "9020a1d31d636b354ca4f28b0f979625630b2ae4f9d63f85f48d82f337541cb4312d1df3570ca7b05f9afdf027804b4a5881cb97354363ee03f6bfe97be4e913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-grape"

RDEPENDS:${PN} += "/usr/bin/sh \
bliss \
gap-core \
nauty"

inherit rpm
