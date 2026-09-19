SUMMARY = "Archiver for .arj files"
DESCRIPTION = "An implementation of an .arj archiving program. It preserves compatibility and \
retains the feature set of original ARJ archiver as provided by ARJ Software, \
Inc. \
This open implementation is produced by the namesake, but otherwise \
unaffiliated, ARJ Software Russia."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.22"

RPM_NAME = "arj-3.10.22-6.15.aarch64.rpm"
RPM_HASH = "15ac65656f4a774f1b20cdd90ba813e37268aab9b136d470d43c5b812dd082155e50bc0435e59b8f1f5c01f43a7346b25f4a84656e9b19fc933b7293b97cda22"

RPROVIDES:${PN} += "arj \
config-arj"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
