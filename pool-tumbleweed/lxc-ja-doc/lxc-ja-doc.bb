SUMMARY = "Japanese documentation for lxc"
DESCRIPTION = "Japanese language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "7.0.0"

RPM_NAME = "lxc-ja-doc-7.0.0-1.3.noarch.rpm"
RPM_HASH = "bb42066ff76512bd943a59c85eedc1942d2549af5afd7b4601f102e0168fafd34896b329c3a682ae4c9985d55d37c0d8db874bfa0a05deb6487f54be9e022d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ja-doc"

RDEPENDS:${PN} += "lxc"

inherit rpm
