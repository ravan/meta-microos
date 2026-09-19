SUMMARY = "Provides textstyling for console output"
DESCRIPTION = "GNU libtextstyle provides an easy way to add styling to programs that produce output to a console or terminal emulator window. \
It does this in a way that allows the end user to customize the styling using the industry standard, namely Cascading Style Sheets (CSS)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "libtextstyle0-1.0-2.4.aarch64.rpm"
RPM_HASH = "307f6fce06de4d865a06b33c69b1a90c610fdcd48c20f3ddb518bf70c317224cec9d00b3664ecb3a4f97ed669acb000b95bb347dd50f4cdcd4d773c8e1e77762"

RPROVIDES:${PN} += "libtextstyle.so.0 \
libtextstyle0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
