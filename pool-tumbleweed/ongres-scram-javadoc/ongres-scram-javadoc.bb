SUMMARY = "Javadoc for ongres-scram"
DESCRIPTION = "This package contains javadoc for ongres-scram"
LICENSE = "BSD-2-Clause"

PV = "3.2"

RPM_NAME = "ongres-scram-javadoc-3.2-7.3.noarch.rpm"
RPM_HASH = "5befaba51dff7fa6337272b72bcb96abc5b816b374265136a058cdb6e2b2a32ca8abfb263a34ad606af4ab31952232064c5e21db4cdee2a9ca5cf981eb22ce5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ongres-scram-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
