SUMMARY = "Model Context Protocol server for graphify"
DESCRIPTION = "The graphify-mcp entry point, exposing the graphify knowledge graph \
to AI assistants over the Model Context Protocol."
LICENSE = "Apache-2.0 & MIT"

PV = "0.9.61"

RPM_NAME = "python314-graphifyy-mcp-0.9.61-1.1.noarch.rpm"
RPM_HASH = "9c7af51d9e057d70ea0bb8956b225e4d321b45b5b4253d801a185404bbcccd51e34b0bf03d1475032d509972855cdc80eab873a7ea85ce18cb5c577e0beb72be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-graphifyy-mcp"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python314-graphifyy \
python314-mcp \
python314-starlette"

inherit rpm
