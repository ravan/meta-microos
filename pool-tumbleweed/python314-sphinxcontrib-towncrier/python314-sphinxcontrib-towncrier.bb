SUMMARY = "An RST directive for injecting a Towncrier-generated changelog draft"
DESCRIPTION = "An RST directive for injecting a Towncrier-generated changelog draft containing fragments for the unreleased (next) project version"
LICENSE = "BSD-3-Clause"

PV = "0.5.0a0"

RPM_NAME = "python314-sphinxcontrib-towncrier-0.5.0a0-1.2.noarch.rpm"
RPM_HASH = "2761f962d6ba8361ce681bb0e6692545a0e56b40065f6ec62b0c9f24de3f7900c46defbea63f093e347b677680be9abdd14d3571ca25ab86a228fe5ca536aac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-towncrier \
python314-sphinxcontrib-towncrier \
python3dist-sphinxcontrib-towncrier"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-towncrier"

inherit rpm
