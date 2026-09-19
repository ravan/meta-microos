SUMMARY = "Async-friendly dependency injection for Python"
DESCRIPTION = "A small, async-friendly dependency-injection helper for Python: declare \
function parameters as dependencies and have them resolved automatically."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-uncalled-for-0.4.0-1.1.noarch.rpm"
RPM_HASH = "408485cd11f4838577cd7f35c57d74a54553bab3e17b6d4d87e241e6ef996850cfff8d1c4a69aec1652c622cfdb4e9e331c0aada029e9655366eec24c18fe08f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uncalled-for \
python3.13dist-uncalled-for \
python313-uncalled-for \
python3dist-uncalled-for"

RDEPENDS:${PN} += "python-abi"

inherit rpm
