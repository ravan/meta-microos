SUMMARY = "Tools from the liblouis braille translator package"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation."
LICENSE = "GPL-3.0-or-later"

PV = "3.39.0"

RPM_NAME = "liblouis-tools-3.39.0-1.1.aarch64.rpm"
RPM_HASH = "93bd422b7859d4a635ad46e0108c5126dfab9166084111148f1d397b99efb441b49a85946bd7633a7586759cc8cf29aed5677a482a8c0c3b47813644867951ae"

RPROVIDES:${PN} += "liblouis-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblouis.so.20 \
libyaml-0.so.2"

inherit rpm
