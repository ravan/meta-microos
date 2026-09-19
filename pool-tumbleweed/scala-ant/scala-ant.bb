SUMMARY = "Scala Ant Support"
DESCRIPTION = "Ant support from scala, copied from original repository \
since it is abandoned in 2.13+"
LICENSE = "Apache-2.0"

PV = "2.13.1"

RPM_NAME = "scala-ant-2.13.1-3.6.noarch.rpm"
RPM_HASH = "0ebd69577172594263f590ecb2667573276917edf8b8165c0b41281a45b0d19396c5d07e075933eff40b841b5bd817feda9061f4dd81e34e7b49fe23b0532218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-scala \
scala-ant"

RDEPENDS:${PN} += "scala"

inherit rpm
