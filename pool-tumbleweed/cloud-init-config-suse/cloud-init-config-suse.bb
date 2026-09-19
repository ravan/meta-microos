SUMMARY = "Configuration file for Cloud node initialization tool"
DESCRIPTION = "This package contains the product specific configuration file \
for cloud-init."
LICENSE = "GPL-3.0"

PV = "25.1.3"

RPM_NAME = "cloud-init-config-suse-25.1.3-6.1.aarch64.rpm"
RPM_HASH = "d5cff8d453fc6b0bebfae5e1f986b6e8a18f6e47b7423dde3c4cd3321b360ef16cc81d4b277fce44050a407a60e7ec4129cd44d8d24b2bc3e17268446fd2b7b2"

RPROVIDES:${PN} += "cloud-init-config \
cloud-init-config-suse \
config-cloud-init-config-suse"

RDEPENDS:${PN} += ""

inherit rpm
