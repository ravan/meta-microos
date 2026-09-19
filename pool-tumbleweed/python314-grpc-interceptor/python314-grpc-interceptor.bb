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

RPM_NAME = "python314-grpc-interceptor-0.15.4-3.4.noarch.rpm"
RPM_HASH = "c995d3cff7b1e354263348ebd4dee1efbf188c00b21527ca5d2c620263d5d26f76a45d1e87f6874691b2cba6382b07f2329a5104dcc64d9ff06cf392029db0e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-grpc-interceptor \
python314-grpc-interceptor \
python3dist-grpc-interceptor"

RDEPENDS:${PN} += "python-abi \
python314-grpcio"

inherit rpm
