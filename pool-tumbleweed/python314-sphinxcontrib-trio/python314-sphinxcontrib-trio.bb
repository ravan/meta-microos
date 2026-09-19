SUMMARY = "Sphinx extension for documenting Python functions and methods"
DESCRIPTION = "This sphinx extension helps documenting Python code that uses \
async/await, or abstract methods, or context managers, or generators. \
It works by making sphinx's regular directives \
for documenting Python functions and methods smarter."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python314-sphinxcontrib-trio-1.2.0-1.2.noarch.rpm"
RPM_HASH = "9d2a580a060b14a75a386af7b3e143652c4d26ef128edea986a0a15f86e6ef92833a66013cea8c86f9b7895ddd52d1a49752ba2f04ebc6f72f35c89593c61c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-trio \
python314-sphinxcontrib-trio \
python3dist-sphinxcontrib-trio"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
