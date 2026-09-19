SUMMARY = "GAP: finitely presented Lie rings"
DESCRIPTION = "A GAP4 package containing functions for constructing Lie rings, and \
working with them. The main functionality of interest concerns: \
 \
* Constructing finitely-presented Lie rings. \
* Performing the Lazard correspondence. \
* A small database of 'largest' n-Engel Lie rings."
LICENSE = "GPL-2.0+"

PV = "2.4.2"

RPM_NAME = "gap-liering-2.4.2-1.9.noarch.rpm"
RPM_HASH = "fcd5c885d33a7d3f42875154768330971196ff68fdd5cfbad729e72691c9e0986d3f803616965362a01d7aaa320871146110935a911425acb47b98cc61df7e5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-liering"

RDEPENDS:${PN} += "gap-core"

inherit rpm
