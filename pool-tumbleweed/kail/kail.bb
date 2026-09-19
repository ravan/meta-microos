SUMMARY = "Kubernetes log viewer"
DESCRIPTION = "Kubernetes tail: streams logs from all containers of all matched pods. \
Match pods by service, replicaset, deployment, and others. Adjusts to a \
changing cluster - pods are added and removed from logging as they fall \
in or out of the selection."
LICENSE = "MIT"

PV = "0.17.4"

RPM_NAME = "kail-0.17.4-1.16.aarch64.rpm"
RPM_HASH = "2ce573b573827db81218e950ca20a3d28c87f2286e167934bf74ac70b5ce876da818a47264b0b4fc02fad7de8aa2756cf145e668a3ab9f84aa031ca7311ef507"

RPROVIDES:${PN} += "kail"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
