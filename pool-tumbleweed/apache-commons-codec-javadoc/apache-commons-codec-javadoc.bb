SUMMARY = "Javadoc for apache-commons-codec"
DESCRIPTION = "Javadoc for apache-commons-codec."
LICENSE = "Apache-2.0"

PV = "1.22.0"

RPM_NAME = "apache-commons-codec-javadoc-1.22.0-1.3.noarch.rpm"
RPM_HASH = "4b63729f6ac68e537ed687d1f16cbf039e29fe2777bfb9698501b613eb3799e4ee79c06dde1d0161028a1eded3baccb79960bc51978b259019effb1a4edb86b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-codec-javadoc \
commons-codec-javadoc \
jakarta-commons-codec-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
javapackages-filesystem"

inherit rpm
