SUMMARY = "Cloud node initialization tool"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node."
LICENSE = "GPL-3.0"

PV = "25.1.3"

RPM_NAME = "cloud-init-25.1.3-6.1.aarch64.rpm"
RPM_HASH = "907dbff9f970f1083911e4273c1aad9a3e2be2cd9c34a301a2f34a5caaf00a48f6fa6fdae978bdcd1797babf3b6d23d1e57c85077582242f02f10be585743c7b"

RPROVIDES:${PN} += "cloud-init \
config-cloud-init \
python3.13dist-cloud-init \
python3dist-cloud-init"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
bash \
cloud-init-config \
e2fsprogs \
file \
growpart \
net-tools \
openssh \
procps \
python-abi \
python313-Jinja2 \
python313-PyYAML \
python313-configobj \
python313-jsonpatch \
python313-jsonschema \
python313-oauthlib \
python313-passlib \
python313-pyserial \
python313-requests \
python313-setuptools \
python313-xml \
sudo \
systemd \
util-linux \
wget"

inherit rpm
