SUMMARY = "Google Cloud Audit Protos"
DESCRIPTION = "Google Cloud Audit Protos"
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python313-google-cloud-audit-log-0.6.1-1.1.noarch.rpm"
RPM_HASH = "f49df2647950f77be8a5269f447f9ccc1a9984065c67941cd859e2d58c902da51230cbcd7fddd88a1cae91932a2961be0056afb80d9c858a406c05be881e7e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-audit-log \
python3.13dist-google-cloud-audit-log \
python313-google-cloud-audit-log \
python3dist-google-cloud-audit-log"

RDEPENDS:${PN} += "python-abi \
python313-googleapis-common-protos \
python313-protobuf"

inherit rpm
