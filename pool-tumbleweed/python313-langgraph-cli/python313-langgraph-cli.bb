SUMMARY = "CLI for interacting with the LangGraph API"
DESCRIPTION = "The LangGraph command line interface lets you build, run and manage LangGraph \
deployments. It provides commands to scaffold new projects from templates, \
build Docker images, and run a local development server for graphs defined in a \
langgraph.json configuration."
LICENSE = "MIT"

PV = "0.4.31"

RPM_NAME = "python313-langgraph-cli-0.4.31-1.1.noarch.rpm"
RPM_HASH = "ab108de6a5e9719a95937825cdcd998b3c6067dedb2edc367bad7ee4156b5a8dd4775fc6df481a6ee67ec00462136a1c27303483e43600fd7097d41f5286a917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-langgraph-cli \
python3.13dist-langgraph-cli \
python313-langgraph-cli \
python3dist-langgraph-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-httpx \
python313-langgraph-sdk \
python313-pathspec \
python313-python-dotenv \
update-alternatives"

inherit rpm
