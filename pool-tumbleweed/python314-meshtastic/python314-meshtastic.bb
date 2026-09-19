SUMMARY = "A Python client for use with Meshtastic devices"
DESCRIPTION = "A Python client for use with Meshtastic devices. This small library (and \
example application) provides an easy API for sending and receiving messages \
over mesh radios. It also provides access to any of the operations/data \
available in the device user interface or the Android application. Events are \
delivered using a publish-subscribe model, and you can subscribe to only the \
message types you are interested in."
LICENSE = "GPL-3.0-only"

PV = "2.7.11"

RPM_NAME = "python314-meshtastic-2.7.11-1.1.noarch.rpm"
RPM_HASH = "bcbdda5499db96a1a488dc8e7377c9d7f86bf365d482626275c47e5fa8a81ca0faedeb79f9f4649dbcd3a4161bf6ff7c53a4aec2db330bdcdb88a1f3eb04060d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-meshtastic \
python314-meshtastic \
python3dist-meshtastic"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-bleak \
python314-packaging \
python314-protobuf \
python314-pypubsub \
python314-pyserial \
python314-requests \
python314-tabulate"

inherit rpm
