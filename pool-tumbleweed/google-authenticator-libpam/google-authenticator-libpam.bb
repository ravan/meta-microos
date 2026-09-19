SUMMARY = "Google Authenticator PAM module"
DESCRIPTION = "Integrate GOOGLE Authenticator into your login process for full 2FA."
LICENSE = "Apache-2.0"

PV = "1.11"

RPM_NAME = "google-authenticator-libpam-1.11-1.1.aarch64.rpm"
RPM_HASH = "2d822366761ce542d188d79dd200c19f437588b9c7c81cfeb0af17d293871eb7e56bd94a8bea0b292fad7366417733d3d9e0a5a9cb45ed9f7d0815c6ee35468c"

RPROVIDES:${PN} += "google-authenticator-libpam \
pam-google-authenticator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libselinux.so.1"

inherit rpm
