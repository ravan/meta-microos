SUMMARY = "Alternative to sudo (root command execution) with regex support"
DESCRIPTION = "please is a regex-capable alternative to sudo, a command for allowing \
users to execute some subsequent commands as the root (or another) user. \
pleaseedit is a method to permit editing of files without \
elevation."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & Apache-2.0 & MIT & GPL-3.0-or-later"

PV = "0.5.6~git0.3ca6938"

RPM_NAME = "pleaser-0.5.6~git0.3ca6938-1.10.aarch64.rpm"
RPM_HASH = "dbeb3ebc4a253d6ab8e48e9cc03144a6594a1c35adc222f0e9386409cd01fd4094488497ce34c8fa6d362951d405e5f2c13ed3f9fd020214a47cb0d6554e4f68"

RPROVIDES:${PN} += "config-pleaser \
pleaser"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libpam-misc.so.0 \
libpam.so.0 \
pam \
permissions"

inherit rpm
