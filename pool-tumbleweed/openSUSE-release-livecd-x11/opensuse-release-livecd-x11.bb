SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-livecd-x11-20260915-3446.1.aarch64.rpm"
RPM_HASH = "723f6a47acd3e0b7df72554bb0b4802b97e20db226f74f62411c4ebcc68d6529bdf15373b634b94eb6f4918bbe7b33b251c21793c9bd4cc7f685f652f9d14c47"

RPROVIDES:${PN} += "flavor-livecd-x11 \
openSUSE-release-livecd-x11 \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
