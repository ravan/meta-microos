SUMMARY = "Systemd default presets for openSUSE MicroOS"
DESCRIPTION = "Default presets for systemd on openSUSE MicroOS"
LICENSE = "MIT"

PV = "20230214"

RPM_NAME = "systemd-presets-branding-MicroOS-20230214-9.3.noarch.rpm"
RPM_HASH = "9c418371e0e5a63f58c4090ffe37bfd92f6a001622c6c3171b163d1eba32190a7558ee66c4752e0268b0b483db66702f13e0a736579948313a3ad92c1f95a455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-MicroOS"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
