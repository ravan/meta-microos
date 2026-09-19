SUMMARY = "Portlet API 1.0 from Jetspeed2"
DESCRIPTION = "Java Standard Portlet API accoring to JSR-168, from Jetspeed-2 . \
 \
Portlet API 1.0 from Jetspeed2."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "apache-portlet-1_0-api-javadoc-1.0-114.9.noarch.rpm"
RPM_HASH = "60ec13c7bfc570f1f963a8f091129eda3d615f6f7df6b58ab451e4a7b9acb130113fb91ad8bb614d721cb18ea25c45016b379439a14e72f921081454d31c9128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-portlet-1-0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
