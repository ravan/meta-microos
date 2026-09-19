SUMMARY = "Group Policy Management Console for YaST"
DESCRIPTION = "The Group Policy Management console for YaST provides tools for creating and \
modifying Group Policy Objects in Active Directory."
LICENSE = "GPL-3.0-only"

PV = "1.5.2"

RPM_NAME = "yast2-gpmc-1.5.2-1.2.noarch.rpm"
RPM_HASH = "78895fe01469913b18ca7b9db4883280381be1b1336143baa381d8ef170c5e4e5f728a2cdda1cfa29ed0fbe4fe357f706467729a56d491147efca0e005650c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast-gpmc \
yast2-gpmc"

RDEPENDS:${PN} += "krb5-client \
python3-ldap \
samba-ad-dc \
samba-client \
samba-python3 \
yast2 \
yast2-adcommon-python \
yast2-python3-bindings"

inherit rpm
