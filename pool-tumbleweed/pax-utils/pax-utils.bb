SUMMARY = "Tools to Check ELF Files for Security Relevant Properties"
DESCRIPTION = "Tools to check ELF files for security relevant properties such as \
non-executable stack."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.8"

RPM_NAME = "pax-utils-1.3.8-2.5.aarch64.rpm"
RPM_HASH = "5457b9a051d5050d0ea51ceb8944a7f57c33163fd343fd9da636429025b2ff0be522eff61f164eeae0ba525a501deaad2a8cbddbaf46ccfe0e4d9a3b0d857ce5"

RPROVIDES:${PN} += "pax-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
python3-pyelftools"

inherit rpm
