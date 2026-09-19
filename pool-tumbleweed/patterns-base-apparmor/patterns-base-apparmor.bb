SUMMARY = "AppArmor"
DESCRIPTION = "AppArmor is an application security framework that provides mandatory access control for programs. It protects from exploitation of software flaws and compromised systems. It offers an advanced tool set that automates the development of per-program application security without requiring additional knowledge."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-apparmor-20241218-34.1.aarch64.rpm"
RPM_HASH = "7462f8345a2f54e28d845e0538e09000f2f0639b1b51503acfd775ab53f3ee316dec4c2770cb60f23121bcf3a1b0ad46bee463c0d72106bf5964f4ea387594e4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-apparmor \
patterns-openSUSE-apparmor"

RDEPENDS:${PN} += "apparmor-abstractions \
apparmor-parser \
apparmor-profiles \
audit \
pattern-"

inherit rpm
