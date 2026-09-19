SUMMARY = "MATE Desktop faenza compilation theme, grey variant"
DESCRIPTION = "This icon theme uses Faenza and Faience icon themes by ~Tiheum and \
some icons customised for MATE by Rowen Stipe. Also, there are some \
icons from Mint-X-F and Faenza-Fresh icon packs."
LICENSE = "GPL-3.0-only"

PV = "1.20.0"

RPM_NAME = "mate-icon-theme-faenza-gray-1.20.0-1.20.noarch.rpm"
RPM_HASH = "75daab29ddaca37d02bad9fb7c94cfa9c4edbd077753d7f3416293f7c08d04a26dbab11295630c9b96f08c9e863312691a897a8ba23018e77548f7714623dcfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-icon-theme-faenza-gray"

RDEPENDS:${PN} += "mate-icon-theme-faenza"

inherit rpm
