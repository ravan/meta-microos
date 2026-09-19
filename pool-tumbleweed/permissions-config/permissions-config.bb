SUMMARY = "SUSE Linux Default Permissions config files"
DESCRIPTION = "The actual permissions configuration files, /usr/share/permissions/permission.*."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20260806"

RPM_NAME = "permissions-config-1699_20260806-1.1.noarch.rpm"
RPM_HASH = "971b046d230c0dba221f4bb92d5363a7c67fc4b45655bd51f5bc845101018a5f23a62bd4cd40b5cd0fd5542d4bfaa942f861e65ab2326227c549d53e0301f1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-permissions-config \
permissions-config \
permissions-doc"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-trusted \
permctl"

inherit rpm
