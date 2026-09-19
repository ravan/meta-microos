SUMMARY = "GRPC library for the google-iam-v1 service"
DESCRIPTION = "GRPC library for the google-iam-v1 service"
LICENSE = "Apache-2.0"

PV = "0.14.5"

RPM_NAME = "python313-grpc-google-iam-v1-0.14.5-1.1.noarch.rpm"
RPM_HASH = "97439a961dd61d981fb36f956a87b8c79865891e9ef850140b3967628f3f0d220c5457c6d42428f6d4c6ebabcaa3820976a586f727e41db74b791f9b2cf68fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grpc-google-iam-v1 \
python3.13dist-grpc-google-iam-v1 \
python313-grpc-google-iam-v1 \
python3dist-grpc-google-iam-v1"

RDEPENDS:${PN} += "python-abi \
python313-googleapis-common-protos \
python313-grpcio \
python313-protobuf"

inherit rpm
