SUMMARY = "Provides a REST client targeted at Orthanc REST API endpoints"
DESCRIPTION = "python-beren provides a REST client targeted at Orthanc REST API endpoints"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python313-beren-0.7.1-5.10.aarch64.rpm"
RPM_HASH = "91dff78c4f5e14322afc71ce305b2c63d8cf999a6f10974a996712ed30853969f9480c250560736490bf5cd6647b4342ed88e096708f39e587cec61e949b4bf0"

RPROVIDES:${PN} += "python3-beren \
python3.13dist-beren \
python313-beren \
python3dist-beren"

RDEPENDS:${PN} += "python-abi \
python313-apiron"

inherit rpm
