SUMMARY = "Java bindings for libsvm"
DESCRIPTION = "This package contains the Java bindings for libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.36"

RPM_NAME = "libsvm-java-3.36-1.6.noarch.rpm"
RPM_HASH = "6faaaeb208fb9b60ce4cb3e39033bc78e5bf871e9b3afe23be34dd352cd1c27d036febbc819bc4edc0b434f9e7b347eeeff4879e7c087c788a05f07701ac3d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsvm-java"

RDEPENDS:${PN} += "java \
javapackages-tools \
libsvm4"

inherit rpm
