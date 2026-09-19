SUMMARY = "LeechCraft Azoth Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft Azoth API. \
 \
It contains description of Azoth API used for developing LeechCraft \
Azoth sub-plugins. For developing first-lexel plugins, please refer \
to corresponding packages (like leechcraft-doc). This documentation \
is also available online at http://doc.leechcraft.org/azoth/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-doc-0.6.70+git.18808.g3467692359-3.1.noarch.rpm"
RPM_HASH = "09a29bd35311b3e12be9ebb86a74980902cbf0c08345573e4c6e697d3f03ee60696425387655c094531e1c3f8c05fae0c281c6a2820037cc783e1ea6ca155fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-azoth-doc"

RDEPENDS:${PN} += ""

inherit rpm
