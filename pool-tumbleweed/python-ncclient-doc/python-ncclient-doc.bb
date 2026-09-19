SUMMARY = "Python NETCONF protocol library - Documentation"
DESCRIPTION = "This package contains documentation files for python-ncclient."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python-ncclient-doc-0.7.1-1.4.noarch.rpm"
RPM_HASH = "3ec7e74c337e36cfba8f32d53ded081a55f891a01eb264fc34113b3be5c36200b9b56edd56b78095b805b74fb5b0b0001b327b02ba8664abe623aa47ae391e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ncclient-doc \
python313-python-ncclient-doc \
python314-python-ncclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
