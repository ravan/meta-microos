SUMMARY = "The archiver base class library"
DESCRIPTION = "The archiver base class, used by specific archive formats, is made \
available as a library in its own right so that support for other \
archive formats can be built outside the kio-extras source tree."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkioarchive6-6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d513fd1b7a22f4d32e73130ad8b6a11256786d279e264e36d87b14dc26e95f4c8243d0d4bf4ddfc19fc37735c4adf99de251704981ffd5af2a8dcc0910a17247"

RPROVIDES:${PN} += "libkioarchive6-6 \
libkioarchive6.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
