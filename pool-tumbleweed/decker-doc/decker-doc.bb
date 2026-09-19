SUMMARY = "A multimedia sketchpad"
DESCRIPTION = "Decker is a multimedia platform for creating and sharing interactive documents, with sound, images, hypertext, and scripted behavior."
LICENSE = "MIT"

PV = "1.60"

RPM_NAME = "decker-doc-1.60-1.3.noarch.rpm"
RPM_HASH = "1baa80a76a9b08a513536e01ab00c14ba630b14a0ceef0ae1fb6a2734a375012dab20c53858e1b96724e5f3f9dc8a1db5de3ffd187b13d36fbadd9f96d6cb013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "decker-doc"

RDEPENDS:${PN} += ""

inherit rpm
