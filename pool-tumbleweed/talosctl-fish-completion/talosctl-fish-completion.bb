SUMMARY = "Fish Completion for talosctl"
DESCRIPTION = "Fish command line completion support for talosctl."
LICENSE = "MPL-2.0"

PV = "1.13.9"

RPM_NAME = "talosctl-fish-completion-1.13.9-1.1.noarch.rpm"
RPM_HASH = "0cf48903186d495288534b27417969b15dbf1d2dc49c4a62f5abdbc3171a64ea422cd10f3ebfe9e20048d175d38e9a1537d91d13489dc87a396fc211bce4998e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "talosctl-fish-completion"

RDEPENDS:${PN} += "talosctl"

inherit rpm
