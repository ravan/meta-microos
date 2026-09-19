SUMMARY = "A library to choose unique available network ports"
DESCRIPTION = "Portpicker provides an API to find and return an available network port for \
an application to bind to. Ideally suited for use from unittests or for test \
harnesses that launch local servers."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "python314-portpicker-1.6.0-3.5.noarch.rpm"
RPM_HASH = "20bf1ec755ca12c87a19d2ddd6566613c7033c3235d66ad26dd07c5b586eaec2cfc3ec00cd5451885cfb7cfbc48b63ceaec3492f2332f046f648e43fea490a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-portpicker \
python314-portpicker \
python3dist-portpicker"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
