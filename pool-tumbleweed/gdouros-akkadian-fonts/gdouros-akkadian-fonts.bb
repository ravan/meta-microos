SUMMARY = "Font with Support for Ancient Akkadian Scripts"
DESCRIPTION = "Akkadian covers the following scripts and symbols supported by \
The Unicode Standard: Basic Latin, Greek and Coptic, some \
Punctuation and other Symbols, Cuneiform, Cuneiform Numbers \
 and Punctuation."
LICENSE = "SUSE-Permissive"

PV = "7.17"

RPM_NAME = "gdouros-akkadian-fonts-7.17-1.24.noarch.rpm"
RPM_HASH = "ed625a5c27ff15492d9d19b86fd27c40117ed9fbae069f16ec0630b374c7dcd89f7814b090d0635cfa061118fae144c04f539452860af9451ba16f4141de2e4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akkadian-fonts \
gdouros-akkadian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
