SUMMARY = "Checks syntax of reStructuredText and code blocks nested within it"
DESCRIPTION = "Checks syntax of reStructuredText and code blocks nested within it"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-rstcheck-core-1.3.0-1.2.noarch.rpm"
RPM_HASH = "114e2dbe453ea2f2eb75ed80f3619fd0e7772dc6c4fc41baaa07715b130c77f56b56a9f5d15888c959ae75d9e6cc8d64efc149463720883a1112f5e38e5fd794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rstcheck-core \
python314-rstcheck-core \
python3dist-rstcheck-core"

RDEPENDS:${PN} += "python-abi \
python314-docutils \
python314-pydantic"

inherit rpm
