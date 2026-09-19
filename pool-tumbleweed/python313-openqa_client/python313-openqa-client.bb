SUMMARY = "Python openQA client library"
DESCRIPTION = "This is a client for the openQA API, based on requests."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python313-openqa_client-4.3.1-2.2.noarch.rpm"
RPM_HASH = "308cd0a7e918c89c0f2c207c17a42e76361ddcb742051046abc34ede3a06c0d953596acbfdfccebfdda84ebaf5e1a7a5685a6c9730f1f061b771bba01222add2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openqa-client \
python3.13dist-openqa-client \
python313-openqa-client \
python3dist-openqa-client"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-requests"

inherit rpm
