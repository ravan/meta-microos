SUMMARY = "Ollama python bindings"
DESCRIPTION = "Official ollama python bindings"
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python314-ollama-0.6.2-1.3.noarch.rpm"
RPM_HASH = "e35bcbd9acf31bd7d8461f27599d51f4aaeb89dab460205fcbcbc6c4fd9fd5672b2ec17795e83b908c6abd418f542f77f8e1e7382ae0f322f8ed9190304bffae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ollama \
python314-ollama \
python3dist-ollama"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-pydantic"

inherit rpm
