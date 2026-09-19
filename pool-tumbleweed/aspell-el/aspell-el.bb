SUMMARY = "Greek (ελληνικά) Dictionary for Aspell"
DESCRIPTION = "A Greek (ελληνικά) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.3+0.08"

RPM_NAME = "aspell-el-0.50.3+0.08-4.7.aarch64.rpm"
RPM_HASH = "88e26819cc293c11130840d405c6bbbbca43cddbf067e3f380e9d5aba00326685a674f97550f3436b7e61fc5634f6c610b76c9658352739d3ec3a37a2ef3ff11"

RPROVIDES:${PN} += "aspell-el \
locale-aspell-el"

RDEPENDS:${PN} += ""

inherit rpm
