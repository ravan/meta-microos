SUMMARY = "Version Lock Plugin for DNF"
DESCRIPTION = "Version lock plugin takes a set of name/versions for packages and excludes all other \
versions of those packages. This allows you to e.g. protect packages from being \
updated by newer versions."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "python3-dnf-plugin-versionlock-4.10.1-1.6.noarch.rpm"
RPM_HASH = "f0becb1bddf6943cd88a5cc5d54b4f4e64e505a0b9bfaf668ed857e40d70023ab97e6d74d1ed56e7889bc1dcfdeb339db8499630b2fedfa4afa4a9b8e3131a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-versionlock \
dnf-command-versionlock \
dnf-plugin-versionlock \
dnf-plugins-extras-versionlock \
python3-dnf-plugin-versionlock \
python3-dnf-plugins-extras-versionlock \
yum-versionlock"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-core"

inherit rpm
