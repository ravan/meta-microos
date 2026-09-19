SUMMARY = "Tools to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde-tools is a project to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libluksde-tools-20260902-1.2.aarch64.rpm"
RPM_HASH = "7eca160c5fa89041f23b7adf50f329a993e81ad6c5433fd98826e3f3097f86dcf3bded812f85aac4f876eee70b0de8173be4b7b6242f45658c48f46f3bb62a75"

RPROVIDES:${PN} += "libluksde-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libluksde.so.1 \
libuna.so.1"

inherit rpm
