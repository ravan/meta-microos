SUMMARY = "Simplifies gRPC interceptors"
DESCRIPTION = "Simplified Python gRPC interceptors. \
 \
The Python `grpc` package provides service interceptors, but they're a bit hard to \
use because of their flexibility. The `grpc` interceptors don't have direct access \
to the request and response objects, or the service context. Access to these are often \
desired, to be able to log data in the request or response, or set status codes on the \
context."
LICENSE = "MIT"

PV = "0.15.4"

RPM_NAME = "python313-grpc-interceptor-0.15.4-3.4.noarch.rpm"
RPM_HASH = "a9309595cbe3c047fcf59c39877408136ab1ded00ac1a21ac6a523f18bee74b4303352eaf7358666797dadd693c08e4ff29c7523f636cd0ec2d411b9f37c0607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grpc-interceptor \
python3.13dist-grpc-interceptor \
python313-grpc-interceptor \
python3dist-grpc-interceptor"

RDEPENDS:${PN} += "python-abi \
python313-grpcio"

inherit rpm
