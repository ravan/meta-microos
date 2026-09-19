SUMMARY = "Model Context Protocol server for graphify"
DESCRIPTION = "The graphify-mcp entry point, exposing the graphify knowledge graph \
to AI assistants over the Model Context Protocol."
LICENSE = "Apache-2.0 & MIT"

PV = "0.9.61"

RPM_NAME = "python313-graphifyy-mcp-0.9.61-1.1.noarch.rpm"
RPM_HASH = "cbde7efa895dc71d18bf0fc4996738fe433df557977de85143528a2eb2d842b829e2271777c5f59946e31b088c21c2849e9d75a3a135d738aed3914df583a9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "graphifyy-mcp \
python3-graphifyy-mcp \
python313-graphifyy-mcp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python313-graphifyy \
python313-mcp \
python313-starlette"

inherit rpm
