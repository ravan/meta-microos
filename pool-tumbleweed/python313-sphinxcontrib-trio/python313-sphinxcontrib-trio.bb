SUMMARY = "Sphinx extension for documenting Python functions and methods"
DESCRIPTION = "This sphinx extension helps documenting Python code that uses \
async/await, or abstract methods, or context managers, or generators. \
It works by making sphinx's regular directives \
for documenting Python functions and methods smarter."
LICENSE = "Apache-2.0 | MIT"

PV = "1.2.0"

RPM_NAME = "python313-sphinxcontrib-trio-1.2.0-1.2.noarch.rpm"
RPM_HASH = "69540d6fde15719acb95683602919627ad9c52fd90ff15ddfe4a87631d6997015da23957930f4b29e501feb8aeab422ab6068973509e3edce1fc7f78a6b8e6af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-trio \
python3.13dist-sphinxcontrib-trio \
python313-sphinxcontrib-trio \
python3dist-sphinxcontrib-trio"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
