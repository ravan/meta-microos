SUMMARY = "SUSE Linux Default Permissions tool"
DESCRIPTION = "Tool to check and set file permissions."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20260806"

RPM_NAME = "permctl-1699_20260806-1.1.aarch64.rpm"
RPM_HASH = "290c6b7f7399c834f6b01b9b517815ceed7898e0b85ab1916ac9e42d65cb278bc7b4c344871e8e3ac43d1e0438021b90b03ff3e64d93b492421ce016a712bb87"

RPROVIDES:${PN} += "chkstat \
permctl \
rpm-macro-set-permissions \
rpm-macro-verify-permissions"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcap.so.2 \
libgcc-s.so.1"

inherit rpm
