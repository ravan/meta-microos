SUMMARY = "API documentation for xbean"
DESCRIPTION = "This package provides API documentation for xbean."
LICENSE = "Apache-2.0"

PV = "4.20"

RPM_NAME = "xbean-javadoc-4.20-3.9.noarch.rpm"
RPM_HASH = "d755208cf287321c2add5a6a6fc8dea76dce2b91562c587d9585ddc3a2d212bf6d5a1aa671088a232020f17d779b196bc39846579e303dad1206b7e8b96e6b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xbean-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
