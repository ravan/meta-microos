SUMMARY = "Tool for automatic generation the Java and JNI code"
DESCRIPTION = "This package contains gluegen source code needed to build packages."
LICENSE = "BSD-2-Clause"

PV = "2.3.2"

RPM_NAME = "gluegen2-devel-2.3.2-12.5.noarch.rpm"
RPM_HASH = "d7bb91098b5793d66962deb71697957df2a5428e8e97add8725e7c953d35904a5ec573c8ec5468a47cb44087312b08066b3f8ace382df6dd7e7df1583b6cd25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gluegen2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ant-antlr \
ant-contrib \
ant-junit \
cpptasks \
gluegen2"

inherit rpm
