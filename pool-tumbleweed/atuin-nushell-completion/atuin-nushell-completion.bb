SUMMARY = "Nushell completion for atuin"
DESCRIPTION = "Nushell command line completion support for atuin."
LICENSE = "MIT"

PV = "18.22.0"

RPM_NAME = "atuin-nushell-completion-18.22.0-1.1.noarch.rpm"
RPM_HASH = "0611313b024c1870cdaac2be6b053dee8d8a55d82dbe4fd258b330c296e0fbf0d57b421210ab403a23779bb4adead42212a1932a07140f0750980751e3e9596b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-nushell-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm
