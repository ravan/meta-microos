SUMMARY = "Javadoc for guava"
DESCRIPTION = "API documentation for guava."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "33.4.8"

RPM_NAME = "guava-javadoc-33.4.8-1.6.noarch.rpm"
RPM_HASH = "43ffc25fbc7ffcd62803cfcc0a624b0d1af565cbdb1d3395408c91971db35fdb6eaa3e733f8e1085b27693d8af970849d837e382d56c698804e980f9141789ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
