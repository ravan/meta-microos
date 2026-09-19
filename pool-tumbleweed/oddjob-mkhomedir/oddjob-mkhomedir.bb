SUMMARY = "An oddjob helper which creates and populates home directories"
DESCRIPTION = "This package contains the oddjob helper which can be used by the \
pam_oddjob_mkhomedir module to create a home directory for a user \
at login-time."
LICENSE = "BSD-3-Clause"

PV = "0.34.7"

RPM_NAME = "oddjob-mkhomedir-0.34.7-3.9.aarch64.rpm"
RPM_HASH = "61d0f49b59754efecf9b6f216d1ff1a3a295fbce0c6eda3069eae2839dcba74c71f2742d08e03b6066bd5b3afdab16c5c6e7b151f8900e6e8e27648e4e85366c"

RPROVIDES:${PN} += "config-oddjob-mkhomedir \
oddjob-mkhomedir"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1 \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libpam.so.0 \
libselinux.so.1 \
oddjob \
psmisc \
sed"

inherit rpm
