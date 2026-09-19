SUMMARY = "Configs and scripts to simulate some sudo and su behavior with run0"
DESCRIPTION = "This package contains polkit rules and wrapper scripts for pkexec, su \
and sudo to simulate their behavior with run0. \
The run0 polkit rule tries to be compatible with the \
sudo-policy-auth-wheel-self RPM as far as possible. Supported are \
'nopasswd' and self authentication if an user is in the wheel group."
LICENSE = "BSD-2-Clause"

PV = "0.5.0+git20260822.4d653d8"

RPM_NAME = "run0-wrappers-0.5.0+git20260822.4d653d8-1.1.aarch64.rpm"
RPM_HASH = "20338303bc41c4de8433b72d6a7b3b8f78e18aeac6759456a483787dde572a15a2f2560e2cde4bca5c67c9f500ddbd716a90221740caf88ed609a49a1c3ab7f4"

RPROVIDES:${PN} += "pkexec \
run0-wrappers \
sudo"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
