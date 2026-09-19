SUMMARY = "Business Processes Icinga Web 2 module"
DESCRIPTION = "Create top-level views of your applications in a graphical editor. \
Rules express dependencies between existing hosts and services and \
let you alert on application level. Business processes are displayed \
in a tree or list overview."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "icingaweb2-module-ipl-0.5.0-1.28.noarch.rpm"
RPM_HASH = "5520e3e8e5a7cff0e6b721614596af4b17a3de6b921affcb788e8943377a1d5506aba98464b0885f28d0455dc1f863eb03da30fbc578e03e494ab6f88ca59b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-module-ipl"

RDEPENDS:${PN} += "icingaweb2 \
icingaweb2-module-director"

inherit rpm
