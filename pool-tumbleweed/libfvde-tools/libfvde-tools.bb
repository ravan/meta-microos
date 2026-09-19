SUMMARY = "Several tools for reading the File Vault Drive Encryption format"
DESCRIPTION = "Several tools for reading the File Vault Drive Encryption format \
 \
See libfvde for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20240502"

RPM_NAME = "libfvde-tools-20240502-2.20.aarch64.rpm"
RPM_HASH = "bfdedca9bd4cd676d44a6c5cc7bee84e1826a980d17ac1aa253215c5125362959759588ba5bb6e78b1a18281868b37e887e2041e9404ae6cb1cf7f5e965d0508"

RPROVIDES:${PN} += "libfvde-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libfvde.so.1 \
libfvde1 \
libuna.so.1"

inherit rpm
