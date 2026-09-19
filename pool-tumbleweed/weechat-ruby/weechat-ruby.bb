SUMMARY = "Ruby Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Ruby language."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-ruby-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "5eae80664eec3d44e21daba96bbbcfb9e7a3c893dfbc9de427c4045dcb3dfb9956fa852dbaae069f10b126f4713d923004d5c2d521d8b63730bc4312b572e6e2"

RPROVIDES:${PN} += "weechat-ruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby4.0.so.4.0 \
weechat"

inherit rpm
