SUMMARY = "Java bindings for Ipopt"
DESCRIPTION = "This package provides the java bindings for Ipopt in a jar file."
LICENSE = "EPL-2.0"

PV = "3.14.19"

RPM_NAME = "Ipopt-java-3.14.19-1.7.noarch.rpm"
RPM_HASH = "a2b650fd096d85cc75e7cefac4d707ec8828da8e0385d4bda3eb05789a0363f2b3d91b077f0ff2f2110979a8d550ba783704f1990012883dbaaaea15979d8385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Ipopt-java"

RDEPENDS:${PN} += ""

inherit rpm
