SUMMARY = "Data files for the JAG game"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game. \
 \
Data files (bonus, help, lang, levels, schemes, sounds, tools) for JAG."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-data-0.3.8-2.22.noarch.rpm"
RPM_HASH = "8daf60924fda821af6b9c980fbb9d08b1f495715d39e4d5b859f5ceeb5dbaf62e980c7f469ad2b279de377aa5b35ec195936693b91a2f9cc9fb7709075bfe34f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jag-data"

RDEPENDS:${PN} += "jag"

inherit rpm
