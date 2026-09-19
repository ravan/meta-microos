SUMMARY = "Spying framework"
DESCRIPTION = "Mockito is a spying framework originally based on the Java library with the same name."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "python314-mockito-2.0.4-1.3.noarch.rpm"
RPM_HASH = "ded30c12045a48a7508e16840f00026c70531a70f48a57f904a31623d4cdf4fe3dbc7d8550f6ccabdffb85fea432a494109d7e10ebee2720130ba5454430746c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mockito \
python314-mockito \
python3dist-mockito"

RDEPENDS:${PN} += "python-abi"

inherit rpm
