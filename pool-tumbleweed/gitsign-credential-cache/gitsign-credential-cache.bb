SUMMARY = "Credential cache for gitsign"
DESCRIPTION = "This package provides the gitsign-credential-cache binary and systemd \
user units for caching Sigstore credentials."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "gitsign-credential-cache-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "754efb0f85a32f32804652035c7edb6dcb9ec2576ed70c628b6a85f8fed3aad5f869337d02d85c35388985d77ce78461bca2563a12d8fb1d4b3c3a561bc85047"

RPROVIDES:${PN} += "gitsign-/usr/bin/gitsign-credential-cache \
gitsign-credential-cache"

RDEPENDS:${PN} += "/usr/bin/sh \
gitsign \
libc.so.6"

inherit rpm
