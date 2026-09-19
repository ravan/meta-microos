SUMMARY = "Development files for alembic"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for alembic. If you would like to develop programs using alembic, \
you will need to install alembic-devel."
LICENSE = "BSD-3-Clause"

PV = "1.8.8"

RPM_NAME = "alembic-devel-1.8.8-1.9.aarch64.rpm"
RPM_HASH = "2b8e2fe91824764a81741ea30de820a388fc150c89036216a50e6b10920b132e0b599511599f691f1de9f93a9a9e1735715d27dab11d5da3a761c7c1b4a621a9"

RPROVIDES:${PN} += "alembic-devel \
cmake-Alembic"

RDEPENDS:${PN} += "libAlembic1-8"

inherit rpm
