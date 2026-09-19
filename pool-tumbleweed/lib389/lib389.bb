SUMMARY = "389 Directory Server administration tools and library"
DESCRIPTION = "Python library for interacting with and administering 389 \
Directory Server instances locally or remotely."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.3.1+8c2711bd6"

RPM_NAME = "lib389-3.3.1+8c2711bd6-1.1.aarch64.rpm"
RPM_HASH = "db0ec6fd7fb9b643c1d28cea505b311144aac98fd52b4e3e7460a7a52b14bee6ba97b67671d9bb911e65eccb8a866d9fdfcaa2b9f00daa5566e1bcbbada92116"

RPROVIDES:${PN} += "lib389 \
python3-lib389 \
python3.13dist-lib389 \
python3dist-lib389"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
iproute2 \
krb5-client \
mozilla-nss-tools \
openssl-cli \
python-abi \
python3-argcomplete \
python3-argparse-manpage \
python3-cryptography \
python3-devel \
python3-distro \
python3-ldap \
python3-pip \
python3-psutil \
python3-pyasn1 \
python3-pyasn1-modules \
python3-python-dateutil \
python3-python-slugify"

inherit rpm
