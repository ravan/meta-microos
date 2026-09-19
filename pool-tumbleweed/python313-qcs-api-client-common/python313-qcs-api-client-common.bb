SUMMARY = "Contains core QCS client functionality and middleware implementations"
DESCRIPTION = "The `qcs-api-client-common` package provides a suite of common functionalities for \
QCS client applications. It offers reusable middleware implementations that can be \
integrated into various client libraries. This allows for consistent behavior \
across different projects and facilitates easier maintenance and scalability \
of client-side logic."
LICENSE = "Apache-2.0"

PV = "0.19.1"

RPM_NAME = "python313-qcs-api-client-common-0.19.1-1.1.aarch64.rpm"
RPM_HASH = "63e268025c8e6dba9391c8f24e8d6f29e1a0bdb43d6ad3f6fd6f3590ff1997b55c00a107c68037d89aa47a6f7df22de7030cf0a6afd3cade4802f1c0c3193779"

RPROVIDES:${PN} += "python3-qcs-api-client-common \
python3.13dist-qcs-api-client-common \
python313-qcs-api-client-common \
python3dist-qcs-api-client-common"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python313-grpc-interceptor \
python313-grpcio \
python313-httpx"

inherit rpm
