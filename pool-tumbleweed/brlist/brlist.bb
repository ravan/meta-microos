SUMMARY = "Tool for listing linux bridges with their member interfaces"
DESCRIPTION = "This is a tool to list linux bridges with their member interfaces. \
As there is no good replacement for `brctl` in the iproute2 aera, \
this tool aims to provide a similar user-friendly output."
LICENSE = "GPL-3.0-or-later"

PV = "0.2"

RPM_NAME = "brlist-0.2-2.6.noarch.rpm"
RPM_HASH = "d88cbef5a687179dd769096dfd41058637793f6826d1f66e3d5ef088598bb7c7b8e7bdce26b463f0e11f1ace83fd5db7856b234fac0135355b3ec62b4d932acc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brlist"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
iproute2 \
python3"

inherit rpm
