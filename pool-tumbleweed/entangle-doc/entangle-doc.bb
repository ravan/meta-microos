SUMMARY = "Documentation for entangle"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
Documentation for entangle."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-doc-3.0-3.2.noarch.rpm"
RPM_HASH = "0e818c9048267f447a6c9ed4c83be2c92f8509e49426aa593c5cc8548c6cd7983443d5bddd30864451ae9c8f26dfae0b23ad176a09c4b024e431994260b85df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "entangle-doc"

RDEPENDS:${PN} += "entangle"

inherit rpm
