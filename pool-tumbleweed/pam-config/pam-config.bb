SUMMARY = "Utility to modify common PAM configuration files"
DESCRIPTION = "pam-config is a command line utility to maintain the common PAM \
configuration files included by most PAM application configuration \
files. It can be used to configure a system for different network or \
hardware based authentication schemes. pam-config can also \
add/adjust/remove other PAM modules and their options."
LICENSE = "GPL-2.0-only"

PV = "2.14+git.20260216"

RPM_NAME = "pam-config-2.14+git.20260216-1.4.aarch64.rpm"
RPM_HASH = "a9af556a4e75c5661be471cb4d8a1062e82796f7ed2d6fa099deae470376a3627e105574d377e3de7fbc388860d1c026e81953426f8bad2b42c740f577daf8df"

RPROVIDES:${PN} += "config-pam-config \
pam-config"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0 \
pam \
pam-extra"

inherit rpm
