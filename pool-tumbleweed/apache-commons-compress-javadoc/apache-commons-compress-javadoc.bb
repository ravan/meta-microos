SUMMARY = "API documentation for apache-commons-compress"
DESCRIPTION = "This package provides API documentation for apache-commons-compress."
LICENSE = "Apache-2.0"

PV = "1.28.0"

RPM_NAME = "apache-commons-compress-javadoc-1.28.0-2.3.noarch.rpm"
RPM_HASH = "9d97adc52a35493c3feda99410a42ba08952c35b83d9ecd927cf89a29fd91f410b3f0fddbc00893067c64171a243661e5833d65fe4be4fd051a2c66fa281875a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-compress-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
