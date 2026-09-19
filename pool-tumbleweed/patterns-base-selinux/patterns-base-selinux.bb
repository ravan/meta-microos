SUMMARY = "SELinux Support"
DESCRIPTION = "Security-Enhanced Linux (SELinux) provides a mechanism for supporting access control security policies, including mandatory access controls (MAC). \
Its architecture strives to separate enforcement of security decisions from the security policy, and streamlines the amount of software involved with security policy enforcement."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-selinux-20241218-34.1.aarch64.rpm"
RPM_HASH = "365a002148eb3f29baf67c6ecd9c1768b7ff1cfe9e8f3f8ef245d730ad67c5183d57ff53a083e6c27b6f009e66117c31f9e3267b55bf06cf221841d81fbf049a"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-selinux"

RDEPENDS:${PN} += "pattern- \
policycoreutils \
selinux-autorelabel \
selinux-policy \
selinux-policy-base \
selinux-tools"

inherit rpm
