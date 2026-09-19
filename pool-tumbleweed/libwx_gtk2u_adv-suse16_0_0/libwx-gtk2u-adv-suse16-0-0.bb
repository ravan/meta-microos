SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_adv-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "fb4617954f919a3b8e7e197c388f0d29d5ce3eafcb680aa78cad9a3f7ce685a97ec22d9bbd23bc66fbdd47f584dcb442f48aaae66fce88b44db93fbbd152714d"

RPROVIDES:${PN} += "libwx-gtk2u-adv-suse.so.16.0.0 \
libwx-gtk2u-adv-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
