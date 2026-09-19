SUMMARY = "Systemd default presets for Kalpa Desktop"
DESCRIPTION = "Default presets for systemd on openSUSE Kalpa"
LICENSE = "MIT"

PV = "20250624"

RPM_NAME = "systemd-presets-branding-Kalpa-20250624-1.4.noarch.rpm"
RPM_HASH = "421fd99e450786ad7e2276e86ed23368f7f45f8548b2307681454eadb932518a109ab82d4f516c9db99c9ac3825921528f37705519688259abb0c07391362b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-branding \
systemd-presets-branding-Kalpa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
systemd-presets-common-SUSE"

inherit rpm
