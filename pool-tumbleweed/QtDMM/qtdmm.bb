SUMMARY = "DMM Readout Software Including a Configurable Recorder"
DESCRIPTION = "QtDMM is a DMM readout software including a configurable recorder. The \
recorder features manual start, scheduled start (at a given time), and \
triggered automatic start when given thresholds are reached. \
Additionally, you can start an external application when given \
thresholds are reached. \
 \
Although initially written for Metex (and compatible, like VOLTCRAFT) \
multimeter, which use a 14-byte protocol, several more protocols have \
been added. For more information about the currently supported DMMs, \
refer to the preset table."
LICENSE = "GPL-3.0-only"

PV = "0.9.8"

RPM_NAME = "QtDMM-0.9.8-5.9.aarch64.rpm"
RPM_HASH = "173d392f8377cc3ff723cf49ddca73e9a6244a9e4daef6cbb09fcc1ba15c56a8cce7b1328c93d5b249d2c0e97429c68ddc57d02f05c0178acf75de7f53fdfd5d"

RPROVIDES:${PN} += "QtDMM"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
