SUMMARY = "Javadoc for jaxen"
DESCRIPTION = "Javadoc for jaxen."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "jaxen-javadoc-2.0.0-1.11.noarch.rpm"
RPM_HASH = "3b767105591f76a65a2e3ef792d247946daa92d5c3a5415839e90841b7edde118435c35004882079f3cb75f1987fe0a91de4f8e386e894d068e6d28853ffb0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxen-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
