SUMMARY = "An RST directive for injecting a Towncrier-generated changelog draft"
DESCRIPTION = "An RST directive for injecting a Towncrier-generated changelog draft containing fragments for the unreleased (next) project version"
LICENSE = "BSD-3-Clause"

PV = "0.5.0a0"

RPM_NAME = "python313-sphinxcontrib-towncrier-0.5.0a0-1.2.noarch.rpm"
RPM_HASH = "18e975b03a09f1c33343aebfc2b43a8261763443d4566e9b81d5eaa378dd5d4cc61bb1cfdfe1ff3869ac256c3e3c89401268f987f5ccfd999bd7a71a41f9abdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-towncrier \
python3.13dist-sphinxcontrib-towncrier \
python313-sphinxcontrib-towncrier \
python3dist-sphinxcontrib-towncrier"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-towncrier"

inherit rpm
