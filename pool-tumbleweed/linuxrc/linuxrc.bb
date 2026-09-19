SUMMARY = "SUSE Installation Program"
DESCRIPTION = "SUSE installation program."
LICENSE = "GPL-3.0+"

PV = "9.6"

RPM_NAME = "linuxrc-9.6-1.5.aarch64.rpm"
RPM_HASH = "b83bdd0d696278a99763ca6778058ffef05d75ecf85e6ffbff0ff6f1a9d2e26b04f19763b02763cd95856a4ea23b0a51276de725c43cb90af83c8b3df0d14bf0"

RPROVIDES:${PN} += "linuxrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcurl.so.4 \
libhd.so.25 \
libmediacheck.so.7 \
libreadline.so.8"

inherit rpm
