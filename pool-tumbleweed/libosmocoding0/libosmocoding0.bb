SUMMARY = "GSM/GPRS/EDGE transcoding routines library"
DESCRIPTION = "libosmocoding is a library which provides GSM, GPRS and EDGE \
transcoding routines. \
 \
The following data types are currently supported: xCCH, PDTCH (CS 1-4 \
and MCS 1-9), TCH/FR, TCH/HR, TCH/AFS, RCH/AHS, RACH and SCH."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmocoding0-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "4f987938cb684a70c05eaf89938bd02000d9627fe9755efa1c1465cb1349a913af9bf2de6504959f46cf848659b004590f662838c4aa930d054e1ad6df459e94"

RPROVIDES:${PN} += "libosmocoding.so.0 \
libosmocoding0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocodec.so.4 \
libosmocore.so.22 \
libosmogsm.so.20"

inherit rpm
