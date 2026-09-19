SUMMARY = "CLI for interacting with the LangGraph API"
DESCRIPTION = "The LangGraph command line interface lets you build, run and manage LangGraph \
deployments. It provides commands to scaffold new projects from templates, \
build Docker images, and run a local development server for graphs defined in a \
langgraph.json configuration."
LICENSE = "MIT"

PV = "0.4.31"

RPM_NAME = "python314-langgraph-cli-0.4.31-1.1.noarch.rpm"
RPM_HASH = "5fbe4b54f1aba293a9f011eff32b3ef1a44132c1714677ab053f329c470869ed3b198d7c0066e110d95b4252b27489a9c855cc0e60eec03ba4a4f92f023d40e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-langgraph-cli \
python314-langgraph-cli \
python3dist-langgraph-cli"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-httpx \
python314-langgraph-sdk \
python314-pathspec \
python314-python-dotenv \
update-alternatives"

inherit rpm
