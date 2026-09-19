SUMMARY = "Security related tuned daemon profiles"
DESCRIPTION = "Security tuning collection providing tuned profiles related to system security and hardening. \
These profiles typically provide a set of security settings that belong and should be applied \
together. They can be combined with other profiles via include= statement as needed."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-security-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "3271d43ad9264e25cb03ed631adca218b1d09b3b027edadc20b34c13b2b3ac244a13ab59ca58a4099fcff602fd75fa94e125bc4eaa6ba78945e709973f6682cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-security"

RDEPENDS:${PN} += "tuned"

inherit rpm
