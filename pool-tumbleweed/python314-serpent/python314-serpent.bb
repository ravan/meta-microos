SUMMARY = "Serialization based on astliteral_eval"
DESCRIPTION = "Serpent is a simple serialization library based on ast.literal_eval. \
 \
Because it only serializes literals and recreates the objects using ast.literal_eval(), \
the serialized data is safe to transport to other machines (over the network for instance) \
and de-serialize it there."
LICENSE = "MIT"

PV = "1.43"

RPM_NAME = "python314-serpent-1.43-1.2.noarch.rpm"
RPM_HASH = "d05db934fbc2a7357d0bd42bde573eed082f1c0c058c8258b3f5c054e1bd61964303e629698073636caa29c01ef257089fcda84d8dce90a931e60f71f99f8f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-serpent \
python314-serpent \
python3dist-serpent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
