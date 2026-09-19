SUMMARY = "wxWidgets XML parser library"
DESCRIPTION = "This library contains classes for parsing XML documents."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_baseu_xml-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "8df8c5a4141c20767c5db0417040e1f819cd5d4fd1887764a72aa99eb53119a435d0b2cf59f0f111db6abaa5ec2fb96b660d426fb82e411c41f4e1f8d542dc21"

RPROVIDES:${PN} += "libwx-baseu-xml-suse.so.16.0.0 \
libwx-baseu-xml-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0"

inherit rpm
