SUMMARY = "Javadoc for libreadline-java"
DESCRIPTION = "libreadline-java provides Java bindings for libedit though a JNI \
wrapper. This package contains the javadoc documentation for it."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libreadline-java-javadoc-0.8.3-6.1.aarch64.rpm"
RPM_HASH = "244df70164174059c2a3d9cffc0b150464629dcbc7d4410af2014dfe0ff029fa7a065b074a304b06d08055aa6edf62c15a30b9810f16234c370c0a8ae74b3e3b"

RPROVIDES:${PN} += "libreadline-java-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
