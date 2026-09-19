SUMMARY = "Handles source downloads defined in appimage.yml files"
DESCRIPTION = "Experimental appimage support: This parses appimage.yml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.4"

RPM_NAME = "obs-service-appimage-0.12.4-1.1.noarch.rpm"
RPM_HASH = "f019b252583c5000ab3259db60b4bb96430e0a86bd182c6e7282cbc22fa3792133299d5978077f9d80a59813064ac3798e9e1ebd00ea3c152561e269fd608fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-appimage"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm
