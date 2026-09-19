SUMMARY = "An OSP server implementation"
DESCRIPTION = "An OSP server implementation to allow GVM to remotely control OpenVAS."
LICENSE = "AGPL-3.0-or-later"

PV = "22.10.1"

RPM_NAME = "python314-ospd-openvas-22.10.1-1.3.noarch.rpm"
RPM_HASH = "c289ce5f88918a3d83f591939bdf87d4ffbfdd295c76dab796ee50996fd8738bd0607d3db8f7df281184ee328207d9482f677db5c0feea77d5ada12362bd37ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ospd-openvas \
python3.14dist-ospd-openvas \
python314-ospd \
python314-ospd-openvas \
python3dist-ospd-openvas"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-defusedxml \
python314-gnupg \
python314-lxml \
python314-packaging \
python314-paho-mqtt \
python314-psutil \
python314-redis \
update-alternatives"

inherit rpm
