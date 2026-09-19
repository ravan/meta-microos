SUMMARY = "Tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "liblnk-tools-20260525-1.10.aarch64.rpm"
RPM_HASH = "a78cc0303da18378ed73ee38258254cc054c04907d7520b412b30dbe445b851163817ce4e00f4fe954efa474880f78a424544085a406f8e03ecb2b2e3f754e28"

RPROVIDES:${PN} += "liblnk-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libfwsi.so.1 \
liblnk.so.1 \
libuna.so.1"

inherit rpm
