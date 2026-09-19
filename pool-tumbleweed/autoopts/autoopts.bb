SUMMARY = "Automated Option Processing"
DESCRIPTION = "AutoOpts is a tool that virtually eliminates the hassle of processing \
options and keeping man pages, info docs and usage text up to date.  This \
package allows you to specify several program attributes, thousands of \
option types and many option attributes.  From this, it then produces all \
the code necessary to parse and handle the command line and configuration \
file options, and the documentation that should go with your program as \
well."
LICENSE = "GPL-3.0-or-later"

PV = "5.18.16"

RPM_NAME = "autoopts-5.18.16-9.5.aarch64.rpm"
RPM_HASH = "cb3a483cb755b4b28035fc469bd8238eedd36f5cc8c15869e495d09e17307d693b3031dc94c25feca27714691ea95166ee6dde1227905472449941c3e001883b"

RPROVIDES:${PN} += "autogen-/usr/bin/autoopts-config \
autoopts \
libopts-devel \
perl-Mdoc \
pkgconfig-autoopts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/pkg-config \
autogen \
libopts25"

inherit rpm
