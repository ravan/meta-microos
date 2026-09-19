SUMMARY = "Tools to access Microsoft Bitlocker Drive Encrypted volumes"
DESCRIPTION = "Tools to access the BitLocker Drive Encryption (BDE) format. The BDE \
format is used by Windows, as of Vista, to encrypt data on a storage \
media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20260903"

RPM_NAME = "libbde-tools-20260903-1.2.aarch64.rpm"
RPM_HASH = "f648c7c30032de06239105ddf4634a5537f2b3e5f84cfa6ef690444967bceed8176c8c2d42dc0c8d6c54888d198b57dad3881a6d8e8b5ce2936499cf7b84d7cb"

RPROVIDES:${PN} += "libbde-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbde.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfuse3.so.4 \
libuna.so.1"

inherit rpm
