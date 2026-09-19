SUMMARY = "Job-based library to send email through an SMTP server"
DESCRIPTION = "KSMTP is a job based library to send email through an SMTP server. This \
package contains the KSMTP library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6SMTP6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "08634cb3ad9bc89e1f3b6a21a4ffe70f2fdfc632d1cb7dd54b0eb9500ba82bd0c575ac077a3773d16aef3ac24e08999a21d7273cbb403b3f43b12a421b597d9e"

RPROVIDES:${PN} += "libKPim6SMTP.so.6 \
libKPim6SMTP6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ksmtp \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
