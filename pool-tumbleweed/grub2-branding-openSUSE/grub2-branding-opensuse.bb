SUMMARY = "openSUSE Tumbleweed branding for GRUB2"
DESCRIPTION = "openSUSE Tumbleweed branding for the GRUB2's graphical console"
LICENSE = "CC-BY-SA-3.0"

PV = "84.87.20240405"

RPM_NAME = "grub2-branding-openSUSE-84.87.20240405-5.5.noarch.rpm"
RPM_HASH = "1eda2b62a6f7f34294c98bae90b86ff2c02ab0ce5f1c56c534d5af5482029ee485883a33afe36574c022b4c8e0245a6a7f709a17c10221d71d6f4798c2547bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grub2-branding \
grub2-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
