SUMMARY = "SELinux binary policy manipulation tools"
DESCRIPTION = "libsepol provides an API for the manipulation of SELinux binary \
policies. It is used by checkpolicy (the policy compiler) and similar \
tools, as well as by programs like load_policy that need to perform \
specific transformations on binary policies such as customizing \
policy boolean settings."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsepol-utils-3.11-1.2.aarch64.rpm"
RPM_HASH = "89b751713d11228e3cf857a55eff682d45f5a46ccac99de5da5d566df96936789a1b64d99b4b8a439bb286f78eb094c4d0548c3748765773b79b205215a62286"

RPROVIDES:${PN} += "libsepol-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsepol.so.2"

inherit rpm
