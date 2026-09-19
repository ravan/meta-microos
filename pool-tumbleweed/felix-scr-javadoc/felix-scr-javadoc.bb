SUMMARY = "Javadoc for felix-scr"
DESCRIPTION = "This package contains javadoc for felix-scr."
LICENSE = "Apache-2.0"

PV = "2.1.30"

RPM_NAME = "felix-scr-javadoc-2.1.30-2.7.noarch.rpm"
RPM_HASH = "b87f2c9aeb2666f3f6bde872578002e7652ec465b49d6a402012edd90706ce2b294868ca7877fc7ae46d4831487f2c73b3b02083fd1a0958bba1ce635e7bfc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-scr-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
