SUMMARY = "A library to provide automatic paging for console output"
DESCRIPTION = "Autopage is a Python library to \
automatically display terminal output from a program \
in a pager (like `less`)"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python313-autopage-0.6.0-1.3.noarch.rpm"
RPM_HASH = "149e520367e4745fb8973872d4d9f6bea79d913441cbc91696c967e5bc47faf0f6a0f9c904a996eda11eda4a6ac44dad1ead2873eefef48bced90684d3e86d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autopage \
python3.13dist-autopage \
python313-autopage \
python3dist-autopage"

RDEPENDS:${PN} += "python-abi"

inherit rpm
