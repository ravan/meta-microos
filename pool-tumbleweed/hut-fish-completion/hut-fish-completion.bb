SUMMARY = "Fish Completion for hut"
DESCRIPTION = "The official fish completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "hut-fish-completion-0.8.0-1.4.noarch.rpm"
RPM_HASH = "e20623276089e28dc5b34bea34845f3b64b573803305d44d2c353f187548fcbb8ca45d8faa3aef7459c5f070823219014eb8cc3748615a334df28e5ce64e502c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
