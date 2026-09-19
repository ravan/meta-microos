SUMMARY = "RPM macros used to setup apparmor profiles"
DESCRIPTION = "Package that provides RPM macros used to setup apparmor profiles for packaging."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "apparmor-rpm-macros-1.0-9.6.noarch.rpm"
RPM_HASH = "168d2e6e3d99506140c780a89096f11630efa152d5e19aeb9e7af074d79583559921273241e7e607fdd174e4c7e17d4258aef1fcba1329dba4987f418666ca2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-rpm-macros \
rpm-macro-apparmor-profilesdir \
rpm-macro-apparmor-reload"

RDEPENDS:${PN} += "coreutils"

inherit rpm
