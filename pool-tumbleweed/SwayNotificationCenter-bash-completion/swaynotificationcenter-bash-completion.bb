SUMMARY = "Bash completion for SwayNotificationCenter"
DESCRIPTION = "Bash command line completion support for SwayNotificationCenter"
LICENSE = "GPL-3.0-only"

PV = "0.12.6"

RPM_NAME = "SwayNotificationCenter-bash-completion-0.12.6-1.3.noarch.rpm"
RPM_HASH = "05ff39b531f1b84c9ca96ed4b34c328dd317f84e957cc09801d8222ecfe77f6c67094c3167e5174a05416a48d71ddbe1cda07b847c0348a82483cfce5cfadc20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "SwayNotificationCenter-bash-completion \
swaync-bash-completion"

RDEPENDS:${PN} += "SwayNotificationCenter \
bash-completion"

inherit rpm
