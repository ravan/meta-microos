SUMMARY = "Provides a REST client targeted at Orthanc REST API endpoints"
DESCRIPTION = "python-beren provides a REST client targeted at Orthanc REST API endpoints"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python314-beren-0.7.1-5.10.aarch64.rpm"
RPM_HASH = "3358e88c9459da0d77e8f5ea3c20d68e6b844f640f55fe789a5f2ef67a0eff6e82b855ab34903184591c57244516d76cf6e96950253009f64f014dd4ed3fa3cb"

RPROVIDES:${PN} += "python3.14dist-beren \
python314-beren \
python3dist-beren"

RDEPENDS:${PN} += "python-abi \
python314-apiron"

inherit rpm
