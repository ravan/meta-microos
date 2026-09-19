SUMMARY = "Selinux support for forgejo-longterm"
DESCRIPTION = "This package adds SELinux enforcement to forgejo-longterm."
LICENSE = "GPL-3.0-or-later"

PV = "15.0.6"

RPM_NAME = "forgejo-longterm-selinux-15.0.6-1.1.noarch.rpm"
RPM_HASH = "51da8ad547ccfab9b9e922520cfc71571a9f1c734a1215448b831a25bca1c2b30c89b708866389625124013d0bf92138aff974b378c357b73aeaf52b8d025226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forgejo-longterm-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
forgejo-longterm \
selinux-policy-targeted"

inherit rpm
