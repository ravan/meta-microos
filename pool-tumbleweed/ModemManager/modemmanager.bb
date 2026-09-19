SUMMARY = "DBus interface for modem handling"
DESCRIPTION = "DBus interface for modem handling. Provides a standard abstracted API \
(over DBus) to communicate with all sorts of modems (landline, GSM, \
CDMA)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.24.2"

RPM_NAME = "ModemManager-1.24.2-1.6.aarch64.rpm"
RPM_HASH = "3a2904d5c2ba2b0e0b15a34829a2b3773efd589360e974a68a1e6bf2c3862748ecb1f89d0df91349cc2601ccb3c3aae285117baaaf1612e23310e2e5a2e27fa9"

RPROVIDES:${PN} += "ModemManager \
libmm-plugin-altair-lte.so \
libmm-plugin-anydata.so \
libmm-plugin-broadmobi.so \
libmm-plugin-cellient.so \
libmm-plugin-cinterion.so \
libmm-plugin-dell.so \
libmm-plugin-dlink.so \
libmm-plugin-ericsson-mbm.so \
libmm-plugin-fibocom.so \
libmm-plugin-foxconn.so \
libmm-plugin-generic.so \
libmm-plugin-gosuncn.so \
libmm-plugin-haier.so \
libmm-plugin-huawei.so \
libmm-plugin-intel.so \
libmm-plugin-iridium.so \
libmm-plugin-linktop.so \
libmm-plugin-longcheer.so \
libmm-plugin-motorola.so \
libmm-plugin-mtk-legacy.so \
libmm-plugin-mtk.so \
libmm-plugin-netprisma.so \
libmm-plugin-nokia-icera.so \
libmm-plugin-nokia.so \
libmm-plugin-novatel-lte.so \
libmm-plugin-novatel.so \
libmm-plugin-option-hso.so \
libmm-plugin-option.so \
libmm-plugin-pantech.so \
libmm-plugin-qcom-soc.so \
libmm-plugin-quectel.so \
libmm-plugin-rolling.so \
libmm-plugin-samsung.so \
libmm-plugin-sierra-legacy.so \
libmm-plugin-sierra.so \
libmm-plugin-simtech.so \
libmm-plugin-telit.so \
libmm-plugin-thuraya.so \
libmm-plugin-tplink.so \
libmm-plugin-ublox.so \
libmm-plugin-via.so \
libmm-plugin-wavecom.so \
libmm-plugin-x22x.so \
libmm-plugin-zte.so \
libmm-shared-fibocom.so \
libmm-shared-foxconn.so \
libmm-shared-icera.so \
libmm-shared-mtk.so \
libmm-shared-novatel.so \
libmm-shared-option.so \
libmm-shared-quectel.so \
libmm-shared-sierra.so \
libmm-shared-telit.so \
libmm-shared-xmm.so \
org.freedesktop.ModemManager"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libmbim-glib.so.4 \
libmm-glib.so.0 \
libpolkit-gobject-1.so.0 \
libqmi-glib.so.5 \
libqrtr-glib.so.0 \
libsystemd.so.0"

inherit rpm
