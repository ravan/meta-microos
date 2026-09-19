SUMMARY = "A better Protobuf / gRPC generator & library"
DESCRIPTION = "A better Protobuf / gRPC generator & library"
LICENSE = "MIT"

PV = "2.0.0b6"

RPM_NAME = "python313-betterproto-2.0.0b6-1.6.noarch.rpm"
RPM_HASH = "584b5504813d5cc73252d23afb5d543b2f559163da0a6212e8802c57b389f1ecc4736b97a6c01e2e7bca6e49b081349a60bb064186f93b9657950ce35a3a1735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-betterproto \
python3.13dist-betterproto \
python313-betterproto \
python3dist-betterproto"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-dateutil \
python313-grpclib \
update-alternatives"

inherit rpm
