SUMMARY = "Game Data for Fish Fillets - Next Generation"
DESCRIPTION = "Fish Fillets is strictly a puzzle game. The goal in each of the 70 \
levels is always the same: to find a safe way out. The fish utter witty \
remarks about their surroundings and the various inhabitants of their \
underwater realm quarrel among themselves or comment on the efforts of \
your fish. The whole game is accompanied by quiet, comforting music. \
 \
This package contains data for the game."
LICENSE = "GPL-2.0+"

PV = "1.0.1"

RPM_NAME = "fillets-ng-data-1.0.1-1.24.noarch.rpm"
RPM_HASH = "8b090cafbc0089e10071e7b3243e26a4f57bb01860cb677be06052cdae019389755aa9043423d8efaa73c1b1e87aca0232904dd08be0bb1dfd62524ae2bb0ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fillets-ng-data"

RDEPENDS:${PN} += "fillets-ng"

inherit rpm
