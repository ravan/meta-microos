SUMMARY = "Serialization based on astliteral_eval"
DESCRIPTION = "Serpent is a simple serialization library based on ast.literal_eval. \
 \
Because it only serializes literals and recreates the objects using ast.literal_eval(), \
the serialized data is safe to transport to other machines (over the network for instance) \
and de-serialize it there."
LICENSE = "MIT"

PV = "1.43"

RPM_NAME = "python313-serpent-1.43-1.2.noarch.rpm"
RPM_HASH = "16bbfafff615ca75e6235f2a55863a999f9c641ba6ecb5736bb5c1fc1aa0ba51062963641b04e68277b7f54f63f8e1f938f4832c3d8474c41b2944a7c691c884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-serpent \
python3.13dist-serpent \
python313-serpent \
python3dist-serpent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
