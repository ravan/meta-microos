SUMMARY = "Thrift C++ library development files"
DESCRIPTION = "Development files for the C++ API of the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "libthrift-devel-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "c8f0b5a393ca13aa38dbb7e5fd19645a26565888c493b5a4a71105ac47f89bd84db07a17ae1c2704af65a9ebb8ca63d48b3beb3327dc00c09040b3badfc08aba"

RPROVIDES:${PN} += "libthrift-devel \
pkgconfig-thrift \
pkgconfig-thrift-nb \
pkgconfig-thrift-z"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libthrift-0-24-0 \
libthriftnb-0-24-0 \
libthriftz-0-24-0"

inherit rpm
