SUMMARY = "YaST2 - Security Configuration"
DESCRIPTION = "The YaST2 component for security settings configuration."
LICENSE = "GPL-2.0-only"

PV = "5.0.6"

RPM_NAME = "yast2-security-5.0.6-1.2.noarch.rpm"
RPM_HASH = "9a19661108652fb2c6918ff52c51ac8343bbe16d846998882d663965d5bcf8b21b33e9a068ee1218cfebcc4198abc89be87459fd13f0d958dcf497275c51c99b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "y2c-sec \
y2t-sec \
yast2-config-security \
yast2-security \
yast2-trans-security"

RDEPENDS:${PN} += "/usr/bin/sh \
augeas-lenses \
yast2 \
yast2-bootloader \
yast2-network \
yast2-pam \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
