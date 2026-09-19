SUMMARY = "Automation for Clojure projects"
DESCRIPTION = "Working on Clojure projects with tools designed for Java can be an \
exercise in frustration. With Leiningen, builds can be describe with \
Clojure. Leiningen handles fetching dependencies, running tests, \
packaging projects and can be extended with a number of plugins."
LICENSE = "EPL-1.0"

PV = "2.12.0"

RPM_NAME = "leiningen-2.12.0-1.3.noarch.rpm"
RPM_HASH = "ba3ea05822dfff3cd4563d7578de44bc03d6a3ce29580943359642981e60ae8a7eb949ed1fe9397b8b58e34f67fdfff2847fd226dc0a3502d29f2a09d4db082e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leiningen"

RDEPENDS:${PN} += "/usr/bin/env \
clojure \
java"

inherit rpm
