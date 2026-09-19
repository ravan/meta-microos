SUMMARY = "Additional scripts for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains additional perl and python scripts for Apache \
Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-scripts-1.10.18-1.1.noarch.rpm"
RPM_HASH = "7ceb191192a3a9776591ea26e6267edd4b3b93927e53cca8fd724c9bc488eda0063be84f179bfa88fd1b4fce6cf3e6b7e4df52aaab4d6312f057ac28459d509d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-scripts"

RDEPENDS:${PN} += "ant \
perl \
python3-base"

inherit rpm
