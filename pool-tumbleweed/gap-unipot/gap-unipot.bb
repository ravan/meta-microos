SUMMARY = "GAP: Elements of unipotent subgroups of Chevalley groups"
DESCRIPTION = "Tools for computing with elements of unipotent subgroups of Chevalley groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "gap-unipot-1.7-1.1.noarch.rpm"
RPM_HASH = "15cd971d1e20f1a45368968ec55407e7668b11cc037c5ba536068715c8256f3b1121cf3dce73741d8324b0477a57572950fff28ab08d6a1e024e56c6640d1a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-unipot"

RDEPENDS:${PN} += "gap-core"

inherit rpm
