SUMMARY = "Swiss army knife for samba"
DESCRIPTION = "Active Directory services tool for samba. \
For join, unjoin, provisioning, demotion, user/group and password administration, \
ldap attribute modification, posix enablement, kdc timesync, pam and nss configuration, \
daemon start/stop, cache flush, etc. \
The ads command attempts to maintain compatibility with the proprietary vastool command, \
while also adding additional features relevant to samba (such as kdc provisioning)."
LICENSE = "GPL-3.0-only"

PV = "2.0+git.0.bdc680d"

RPM_NAME = "ads-2.0+git.0.bdc680d-2.6.noarch.rpm"
RPM_HASH = "550e9ad2d80164060f60af20aca4749431c492b14b1cdb1f9615c52f9ce4f0c5ad5963bda489d05647652057a4ca6e692d63f24fcdb367915aba4d47faa58ae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ads \
vasclnt \
vastool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
krb5-client \
ntp \
python3-dnspython \
python3-ldb \
python3-netifaces \
python3-psutil \
python3-python-pam \
samba-client \
samba-dsdb-modules \
samba-python3"

inherit rpm
