SUMMARY = "Source code of grpc-httpjson-transcoding"
DESCRIPTION = "Source code of grpc-httpjson-transcoding - a library that supports transcoding \
so that HTTP/JSON can be converted to gRPC. It allows to provide APIs in both \
gRPC and REST style at the same time."
LICENSE = "Apache-2.0"

PV = "20190920"

RPM_NAME = "grpc-httpjson-transcoding-source-20190920-2.17.noarch.rpm"
RPM_HASH = "f4b21320ce39ebd98af9e64f537d30beb628db91077e3c59727a02d8db0720cc4f57fb3c43f7ea0fe86f80f0066113da42c17419bcd0ee501ef684eb22315097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-httpjson-transcoding-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
