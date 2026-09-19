SUMMARY = "Shared library libopts"
DESCRIPTION = "AutoOpts is a tool that virtually eliminates the hassle of processing \
options and keeping man pages, info docs and usage text up to date.  This \
package allows you to specify several program attributes, thousands of \
option types and many option attributes.  From this, it then produces all \
the code necessary to parse and handle the command line and configuration \
file options, and the documentation that should go with your program as \
well. \
 \
This package contains shared library libopts"
LICENSE = "GPL-3.0-or-later"

PV = "5.18.16"

RPM_NAME = "libopts25-5.18.16-9.5.aarch64.rpm"
RPM_HASH = "8177c0b3d798189d46ae5002081bf3c64cbc3a621606d1db6a9fd1bc8577edf80cbba5b85745d9de98cb18fc7c301a0334220043a208d80424559a23c9a23006"

RPROVIDES:${PN} += "libopts.so.25 \
libopts25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
