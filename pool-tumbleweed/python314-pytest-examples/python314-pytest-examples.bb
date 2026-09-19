SUMMARY = "Pytest plugin for testing examples in docstrings and markdown files"
DESCRIPTION = "Pytest plugin for testing Python code examples in docstrings and markdown files. \
 \
`pytest-examples` can: \
* lint code examples using `ruff` and `black` \
* run code examples \
* run code examples and check print statements are inlined correctly in the code \
 \
It can also update code examples in place to format them and insert or update print statements."
LICENSE = "MIT"

PV = "0.0.18"

RPM_NAME = "python314-pytest-examples-0.0.18-4.1.noarch.rpm"
RPM_HASH = "64063b8f6ca9f4a04c58316dd28f54676b966682c2dd087b14db19732f1a56f90614f8beb248d28d57d7c84543afbea0cc3425e31a0128fe3e766575f39257de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-examples \
python314-pytest-examples \
python3dist-pytest-examples"

RDEPENDS:${PN} += "python-abi \
python314-black \
python314-pytest \
python314-ruff"

inherit rpm
