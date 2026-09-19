SUMMARY = "Perl Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Perl language."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-perl-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "453de47f845cb1fcbe9a04291d8fbd2bf280f48660f451345e4f86e34b8bf5872723e6ac4848c7b82c335bf8c9fadaba09d356414af2938a49240028ed3b6b03"

RPROVIDES:${PN} += "weechat-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
weechat"

inherit rpm
