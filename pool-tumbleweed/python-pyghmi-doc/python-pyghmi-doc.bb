SUMMARY = "General Hardware Management Initiative (IPMI and others) -- Documentation"
DESCRIPTION = "This is a pure python implementation of IPMI protocol. \
 \
pyghmicons and pyghmiutil are example scripts to show how one may incorporate \
this library into python code"
LICENSE = "Apache-2.0"

PV = "1.6.19"

RPM_NAME = "python-pyghmi-doc-1.6.19-1.1.noarch.rpm"
RPM_HASH = "fdaccf14ff62f4f981dc1e7ab8762ce0c3eedc6c170f42dfcb2bf80dc972c3c7595be07aef11f2cd3efe41f945a5be94009f9cd0455e8d2b87cf2fc54e181636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyghmi-doc"

RDEPENDS:${PN} += ""

inherit rpm
