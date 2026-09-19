SUMMARY = "Tools for basic booting"
DESCRIPTION = "Helper tools from sysvinit that support booting, including but not exclusive \
to startpar and killproc. System V init specific programs are in the \
sysvinit package."
LICENSE = "GPL-2.0-or-later"

PV = "3.14"

RPM_NAME = "sysvinit-tools-3.14-1.7.aarch64.rpm"
RPM_HASH = "5b4764121d428a06fed8741ed86f083b287a348b73d8bcc22da0a96b7446fbd517703cb23dfd01cc89297ad233f6b4b1d114b432ab064c59bf0e8a4ff1879848"

RPROVIDES:${PN} += "/sbin/start-daemon \
/sbin/startproc \
sysvinit-tools"

RDEPENDS:${PN} += "blog \
ld-linux-aarch64.so.1 \
libblogger.so.2 \
libc.so.6"

inherit rpm
