SUMMARY = "Contains core QCS client functionality and middleware implementations"
DESCRIPTION = "The `qcs-api-client-common` package provides a suite of common functionalities for \
QCS client applications. It offers reusable middleware implementations that can be \
integrated into various client libraries. This allows for consistent behavior \
across different projects and facilitates easier maintenance and scalability \
of client-side logic."
LICENSE = "Apache-2.0"

PV = "0.19.1"

RPM_NAME = "python314-qcs-api-client-common-0.19.1-1.1.aarch64.rpm"
RPM_HASH = "ed252722dc3d1a31185caa32627238e2f27233908216ea078be23f3d6932b1460ab5a1a4c071befda6c554c3019ec084d2dc6027a9efd096d92262cf3ac4821f"

RPROVIDES:${PN} += "python3.14dist-qcs-api-client-common \
python314-qcs-api-client-common \
python3dist-qcs-api-client-common"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python314-grpc-interceptor \
python314-grpcio \
python314-httpx"

inherit rpm
