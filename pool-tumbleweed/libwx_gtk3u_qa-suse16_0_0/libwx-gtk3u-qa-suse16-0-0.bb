SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_qa-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "1271ca018af8d05e47ad841cf61a8e20617b5f46a8cb4b4f93841269a9f89aec77b16293d1f8ecc40baa3331640653a12d2e06b9fc43329bfe0b7e69636c1c32"

RPROVIDES:${PN} += "libwx-gtk3u-qa-suse.so.16.0.0 \
libwx-gtk3u-qa-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
