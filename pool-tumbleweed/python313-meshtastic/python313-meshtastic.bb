SUMMARY = "A Python client for use with Meshtastic devices"
DESCRIPTION = "A Python client for use with Meshtastic devices. This small library (and \
example application) provides an easy API for sending and receiving messages \
over mesh radios. It also provides access to any of the operations/data \
available in the device user interface or the Android application. Events are \
delivered using a publish-subscribe model, and you can subscribe to only the \
message types you are interested in."
LICENSE = "GPL-3.0-only"

PV = "2.7.11"

RPM_NAME = "python313-meshtastic-2.7.11-1.1.noarch.rpm"
RPM_HASH = "0d9679dc650bcf0345e4432248636a7e76a9a058d28a27f199a19753caff3753039767dc3c7b1863e702f752f8d6c6b0d260c9b7f1115ccc1ed4ab8d85cf2b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-meshtastic \
python3.13dist-meshtastic \
python313-meshtastic \
python3dist-meshtastic"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-bleak \
python313-packaging \
python313-protobuf \
python313-pypubsub \
python313-pyserial \
python313-requests \
python313-tabulate"

inherit rpm
