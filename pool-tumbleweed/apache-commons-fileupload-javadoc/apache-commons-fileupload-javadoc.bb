SUMMARY = "API documentation for apache-commons-fileupload"
DESCRIPTION = "This package contains the API documentation for apache-commons-fileupload."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "apache-commons-fileupload-javadoc-1.6.0-1.7.noarch.rpm"
RPM_HASH = "0f065beac91c4d3366bb944dd8d623d804c4db281c3779db718e248b23ab27f1828fc13353e01a670a5670d6baf0a3248108d829e86ec7bdf700e9697cddb029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-fileupload-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
