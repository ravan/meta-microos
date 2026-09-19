SUMMARY = "Google Cloud Audit Protos"
DESCRIPTION = "Google Cloud Audit Protos"
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python314-google-cloud-audit-log-0.6.1-1.1.noarch.rpm"
RPM_HASH = "babd1a8462d8831c42705039963adce7a1cbddc85d5e8d38909ac90c3163552321dae5093b2b9609f1af1327b217ca86e169c4285bfbd3d015bcece8417fb63c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-audit-log \
python314-google-cloud-audit-log \
python3dist-google-cloud-audit-log"

RDEPENDS:${PN} += "python-abi \
python314-googleapis-common-protos \
python314-protobuf"

inherit rpm
