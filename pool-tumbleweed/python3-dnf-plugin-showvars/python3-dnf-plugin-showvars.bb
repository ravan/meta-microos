SUMMARY = "showvars Plugin for DNF"
DESCRIPTION = "This plugin dumps the current value of any defined DNF variables. For example \
$releasever and $basearch."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.2"

RPM_NAME = "python3-dnf-plugin-showvars-4.1.2-1.8.noarch.rpm"
RPM_HASH = "b8373e88fd7d2605e0617d17b2ff61147dc9a428d08b184494eb7c6e8feb4a71e15c73728405a6136e45f6ed984f87f514d732b92ec2121c74b5658743a8ea92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugin-showvars \
python3-dnf-plugin-showvars \
python3-dnf-plugins-extras-showvars"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common"

inherit rpm
