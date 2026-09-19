SUMMARY = "Files and Scripts for openSUSE MicroOS"
DESCRIPTION = "Files, scripts and directories for openSUSE MicroOS."
LICENSE = "GPL-2.0-or-later"

PV = "4.0+git29"

RPM_NAME = "microos-tools-4.0+git29-1.1.aarch64.rpm"
RPM_HASH = "d0c1deecbd93bd4cd2d8adc34c29e1553aacc0f542e03388e9ae3dae1a9914cfb21967e58984b79dc55ec509a22bd121fa01dbca761921cbabd4cd1831e58a86"

RPROVIDES:${PN} += "config-microos-tools \
microos-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
man-online \
read-only-root-fs \
selinux-autorelabel \
zypp-single-rpmtrans"

inherit rpm
