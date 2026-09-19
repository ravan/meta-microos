SUMMARY = "Fish Completion for mpv"
DESCRIPTION = "Fish command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.0+git20260309.07c3ff3725"

RPM_NAME = "mpv-fish-completion-0.41.0+git20260309.07c3ff3725-2.2.noarch.rpm"
RPM_HASH = "5eb23b1c429fddf3647f13226d630e343e06ad95d4d1e989769e1f4fc0a7f99f977a8e57f85c2c2d38608dac75907cd6d3cca9041e8fc280bdd9cd91566889ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-fish-completion"

RDEPENDS:${PN} += "mpv"

inherit rpm
