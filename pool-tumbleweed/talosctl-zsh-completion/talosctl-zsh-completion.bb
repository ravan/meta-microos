SUMMARY = "Zsh Completion for talosctl"
DESCRIPTION = "zsh command line completion support for talosctl."
LICENSE = "MPL-2.0"

PV = "1.13.9"

RPM_NAME = "talosctl-zsh-completion-1.13.9-1.1.noarch.rpm"
RPM_HASH = "45dc9491fa52443ec12aceed934d119679f901d661f015325ab92f52c7b674a82c47c2856580e2a1cdf8fbb3420ffcfdbe9306d551b37644f279fde03400cb35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "talosctl-zsh-completion"

RDEPENDS:${PN} += "talosctl"

inherit rpm
