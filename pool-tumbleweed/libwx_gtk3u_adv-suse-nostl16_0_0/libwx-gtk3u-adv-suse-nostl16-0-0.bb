SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_adv-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "b23eb9a0259553a79abc44136678917b1189b87a2990e46107269b566dfbd6c0d2105223d0746be1fa93691c14dc397822f095b949f3dd9df9709c6d19c4c0fa"

RPROVIDES:${PN} += "libwx-gtk3u-adv-suse-nostl.so.16.0.0 \
libwx-gtk3u-adv-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
