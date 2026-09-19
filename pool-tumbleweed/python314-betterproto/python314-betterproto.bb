SUMMARY = "A better Protobuf / gRPC generator & library"
DESCRIPTION = "A better Protobuf / gRPC generator & library"
LICENSE = "MIT"

PV = "2.0.0b6"

RPM_NAME = "python314-betterproto-2.0.0b6-1.6.noarch.rpm"
RPM_HASH = "466f17929c63cd1ee116cedb790975a95b8de6e07b5cea7c56f82180b75bbcb0a1daab11f9fd554c27669519f52164c59e7612a834ecd48056828f8ddf9b80d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-betterproto \
python314-betterproto \
python3dist-betterproto"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-dateutil \
python314-grpclib \
update-alternatives"

inherit rpm
