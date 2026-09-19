SUMMARY = "Vybrid/i.MX recovery utility"
DESCRIPTION = "This utility allows to download and execute code on Freescale i.MX5/i.MX6 and Vybrid SoCs through the Serial Download Protocol (SDP). Depending on the board, there is usually some kind of recovery button to bring the SoC into serial download boot mode, check documentation of your hardware. \
 \
The utility support USB and UART as serial link."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2~git20180504"

RPM_NAME = "imx-usb-loader-0.2~git20180504-1.30.aarch64.rpm"
RPM_HASH = "0b89a401dd6ccd962061371cce9d7880204739ed6e1d40a31eb02afe9d02c46a3d376f5cf5f9c3d3343fe4c510ee0a764eea142a9b6b70ed372a97b7244c5aae"

RPROVIDES:${PN} += "config-imx-usb-loader \
imx-usb-loader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
