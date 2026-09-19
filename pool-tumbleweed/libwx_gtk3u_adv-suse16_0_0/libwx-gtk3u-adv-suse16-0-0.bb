SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_adv-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "fec0d107ffc56dbe005a0c59a459f2b8ab94534de93a7832af71249b088534df6f60785a7e29efc091464d6b8d61039fa4ae5c773403f10dfe3ec56e9dd3f8d8"

RPROVIDES:${PN} += "libwx-gtk3u-adv-suse.so.16.0.0 \
libwx-gtk3u-adv-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
