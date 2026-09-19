SUMMARY = "Common code for the yast python ad modules"
DESCRIPTION = "Common code shared by the yast2-aduc, yast2-adsi, and yast2-gpmc modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "yast2-adcommon-python-1.6-1.17.noarch.rpm"
RPM_HASH = "d90088cf8729cf1b4ecdfd445f48a7c20df13567518ee61b6cddbc8fd4560b8d2e053a4740a8df8fdcd9d4d4cab3ec7c0394bda6d5a408ccc22eee57e39596d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-adcommon-python"

RDEPENDS:${PN} += "krb5-client \
python-abi \
python3-keyring \
python3-ldap \
python3-ldb \
samba-client \
samba-dsdb-modules \
samba-python3 \
yast2 \
yast2-python3-bindings"

inherit rpm
