SUMMARY = "Meta package for dependencies to build MRI"
DESCRIPTION = "Meta package for ruby-build dependencies to build MRI."
LICENSE = "MIT"

PV = "20260902"

RPM_NAME = "ruby-build-dependencies-mri-20260902-1.1.noarch.rpm"
RPM_HASH = "5a6d8036aefa8c0f77f5943b89988ba9269c9599224adec5d12adac4a677aa659347b2324ea54f49cc1010f4b982768ba29a5794da9fc8d8f5ac5f144a3460bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mri"

RDEPENDS:${PN} += "automake \
bison \
gcc \
gdbm-devel \
gperf \
graphviz \
libffi-devel \
libjpeg-devel \
libyaml-devel \
openssl-devel \
readline-devel \
tk-devel"

inherit rpm
