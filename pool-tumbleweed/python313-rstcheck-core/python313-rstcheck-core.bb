SUMMARY = "Checks syntax of reStructuredText and code blocks nested within it"
DESCRIPTION = "Checks syntax of reStructuredText and code blocks nested within it"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-rstcheck-core-1.3.0-1.2.noarch.rpm"
RPM_HASH = "82bc487d3e95f4dde0f1a850a687a2d11093fb33273abcfecc07b13240062c90c958fff6d6d7aea7d56c306ee13c6f22ee520dda0286dbbe592a1003b4024968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rstcheck-core \
python3.13dist-rstcheck-core \
python313-rstcheck-core \
python3dist-rstcheck-core"

RDEPENDS:${PN} += "python-abi \
python313-docutils \
python313-pydantic"

inherit rpm
