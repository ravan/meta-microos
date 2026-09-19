SUMMARY = "Detect if running in a virtual machine"
DESCRIPTION = "This is a collection of scripts which you can use to work out what \
sort of virtualization you are running inside.  Please read the manual \
page virt-what(1) to find out how to use it.  This file is for \
developers and people compiling from source."
LICENSE = "GPL-2.0-or-later"

PV = "1.27"

RPM_NAME = "virt-what-1.27-1.7.aarch64.rpm"
RPM_HASH = "348e72f9cdf893da7d05395c8daf64b47defbd7bf852af0c0e417463055c22f18538588863584822b6e38534830c267bca3ebb38fd78d8d38677f45249ab5db6"

RPROVIDES:${PN} += "virt-what"

RDEPENDS:${PN} += "/usr/bin/sh \
dmidecode \
ld-linux-aarch64.so.1 \
libc.so.6 \
util-linux \
which"

inherit rpm
