SUMMARY = "USB Scanner Autoconfiguration"
DESCRIPTION = "USB scanner autoconfiguration happens via udev. \
 \
The file /udev/rules.d/56-sane-backends-autoconfig.rules contains \
entries for those USB scanners where the USB IDs are known, which are \
supported by a free driver, where the support status is 'complete' or \
'good', and which do not require firmware upload. \
 \
When a USB scanner is connected and its USB IDs match to an entry in \
the 56-sane-backends-autoconfig.rules file, the matching scanner driver \
is activated (i.e. the driver line in /etc/sane.d/dll.conf is \
activated). \
 \
It enables scanner drivers but never disables them. The reason is that \
enabled drivers do not hurt so that an automated disable would make it \
only overcomplicated because when more than one scanner uses the same \
driver, a complicated check would be needed to avoid that the driver is \
accidentally disabled when only one scanner was disconnected. \
 \
If you do not like automated driver activation, do not install this \
package or remove it when it is already installed."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.3.1"

RPM_NAME = "sane-backends-autoconfig-1.3.1-3.11.noarch.rpm"
RPM_HASH = "74c8f1e0aaeb63dbf0909984d374b6c024782438df717119e1c3ebe6e847fb8d62b24d02db0041b5a5c7e5bae8955cbcef26ad5877a5268205a85499944bb733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sane-backends-autoconfig"

RDEPENDS:${PN} += "libsane1"

inherit rpm
