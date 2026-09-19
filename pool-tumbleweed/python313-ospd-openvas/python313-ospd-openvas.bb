SUMMARY = "An OSP server implementation"
DESCRIPTION = "An OSP server implementation to allow GVM to remotely control OpenVAS."
LICENSE = "AGPL-3.0-or-later"

PV = "22.10.1"

RPM_NAME = "python313-ospd-openvas-22.10.1-1.3.noarch.rpm"
RPM_HASH = "29208a0d281d40c4d7994c3c9d99f24711f4332cf18ee69a3a7e3bf3ef7b82cea070ac5f7013c4b89e60796662c83dd9f10e92d049d124a470bd1c7bb3b3556a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ospd-openvas \
python3-ospd \
python3-ospd-openvas \
python3.13dist-ospd-openvas \
python313-ospd \
python313-ospd-openvas \
python3dist-ospd-openvas"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-defusedxml \
python313-gnupg \
python313-lxml \
python313-packaging \
python313-paho-mqtt \
python313-psutil \
python313-redis \
update-alternatives"

inherit rpm
