SUMMARY = "Provides a sphinx code-block for rendering RunThis blocks"
DESCRIPTION = "This provides a sphinx extension that adds RunThis code blocks, \
which display a highligthed code-block statically, but with a \
'RunThis' button above them. When the button is clicked, the code \
block is replaced by a terminal session that has executed that \
code."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python313-runthis-sphinxext-0.0.3-2.10.noarch.rpm"
RPM_HASH = "da62b7e23c3ce58aa5f8a64ac2569e98c15281ea0f04c333f6b9bca8c70e31d151ef44d23d245976caccc325d6476ae8ce3ee4f35bc9fa35a1c8fce1b08da784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-runthis-sphinxext \
python3.13dist-runthis-sphinxext \
python313-runthis-sphinxext \
python3dist-runthis-sphinxext"

RDEPENDS:${PN} += "python-abi"

inherit rpm
