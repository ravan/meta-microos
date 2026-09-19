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

RPM_NAME = "python313-pytest-examples-0.0.18-4.1.noarch.rpm"
RPM_HASH = "f7581b91e2519ca75b1b9ed9e7ee3ae9f3d4f842f6006d156102b3594ca5358c27b9fccf62f3dfb65a9b42416dde7a2cf7c78dfb91aaf2f34d478ae5360fbb9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-examples \
python3.13dist-pytest-examples \
python313-pytest-examples \
python3dist-pytest-examples"

RDEPENDS:${PN} += "python-abi \
python313-black \
python313-pytest \
python313-ruff"

inherit rpm
