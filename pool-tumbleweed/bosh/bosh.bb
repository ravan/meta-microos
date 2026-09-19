SUMMARY = "Multibyte-capable POSIX-conforming Bourne shell"
DESCRIPTION = "bosh is a Bourne-style POSIX command interpreter (shell), similar to dash, \
but supports multibyte input/output."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "bosh-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "9c20de672a97b7e40d2a50f92fe211aa172a3cdcb0ba8ed1c3c7a3a977a38d21490d6975cd1b459676ed44a5eab3ac7dc1beb9f2f0334e6177b1c065f356d641"

RPROVIDES:${PN} += "bosh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libfind.so.4.0 \
libschily.so.2.0 \
libxtermcap.so.1.0"

inherit rpm
