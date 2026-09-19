SUMMARY = "Utilities to uniformly interface desktop environments"
DESCRIPTION = "The xdg-utils package is a set of simple scripts that provide basic \
desktop integration functions for any Free Desktop, such as Linux. \
 \
They are intended to provide a set of de-facto standards. \
This means that: \
 * Third party software developers can rely on these xdg-utils for \
   all of their simple integration needs. \
 \
*  Developers of desktop environments can make sure that their \
   environments are well supported. \
 \
   If a desktop developer wants to be certain that their \
   environment functions with all third party software, then can \
   simply make sure that these utilities work properly in their \
   environment."
LICENSE = "MIT"

PV = "1.2.0+20251025"

RPM_NAME = "xdg-utils-1.2.0+20251025-1.2.noarch.rpm"
RPM_HASH = "eb8e4ecd54ee0a11adeaa1e929985d05dacf66a567cfa95cd9d26310068589a943b97cb54c5e98466081cd24629c444e21e9ca7b0251fd36d69bbc585d8b7c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xdg-utils"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
