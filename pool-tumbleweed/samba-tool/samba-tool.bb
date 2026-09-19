SUMMARY = "Main Samba administration tool"
DESCRIPTION = "The package contains samba-tool, the main tool for Samba Administration."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-tool-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "f32fa49bcf581fa8986d11911fb36aef534b4092849405414cbceafb8212d1411347d6c51860a42b2bd9c0374a8a4d6b7e1c7a6bc6a68532c0ed25efd87ee7b7"

RPROVIDES:${PN} += "samba-tool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-Markdown \
samba \
samba-ldb-ldap \
samba-python3"

inherit rpm
