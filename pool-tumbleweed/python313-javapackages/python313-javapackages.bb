SUMMARY = "Module for handling various files for Java packaging"
DESCRIPTION = "Module for handling, querying and manipulating of various files for Java \
packaging in Linux distributions"
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "python313-javapackages-6.5.1-3.2.noarch.rpm"
RPM_HASH = "96b47050909c27ae5d9275d7ddad1ed775eb57b1223457ddb872a448ed84b381e8186e71c6d17a8482a5d470a48b1137ef31796a5ac1ece0576d408a928d5f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-javapackages \
python3.13dist-javapackages \
python313-javapackages \
python3dist-javapackages"

RDEPENDS:${PN} += "python-abi \
python313-lxml \
python313-xml"

inherit rpm
