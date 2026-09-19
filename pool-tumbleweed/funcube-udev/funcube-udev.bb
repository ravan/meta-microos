SUMMARY = "Udev rules for FCD and FCDpro Plus devices"
DESCRIPTION = "Udev rules for FCD and FCDpro Plus devices."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "funcube-udev-3.10.0.rc3-3.5.noarch.rpm"
RPM_HASH = "ae0e367453d011ab45d37654eaa4b0fddd6ff069ed7f64085e558b5d19e8df9c089560848a2277db04f6fb22bd2077a2bf874823b28203376b5a7d4b0a472825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "funcube-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
