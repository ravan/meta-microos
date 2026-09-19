SUMMARY = "Javadoc for easymock"
DESCRIPTION = "Javadoc for easymock."
LICENSE = "Apache-2.0"

PV = "3.6"

RPM_NAME = "easymock-javadoc-3.6-3.7.noarch.rpm"
RPM_HASH = "ae824e2a25b1345dea732a8523e410034a161ee08a53468cacfae91735ef86d086aa1bc24c7c39e9cbd71457a0893fcc3322936a6e07e44bd987d12f772eab7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easymock-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
