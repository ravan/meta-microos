SUMMARY = "MATE Session Manager GSchemas"
DESCRIPTION = "This package provides the GSettings schemas for \
MATE Session Manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-session-manager-gschemas-1.28.0-1.13.noarch.rpm"
RPM_HASH = "cbb244259074361788f1bdba9aefbc42e2286c5f7f035c6b43b4bd1463c5f6fd5e5e6e7c9bd4153354d3eb8a069b880cbebb2ea29e1cc8c02423d27242ef94fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-session-manager-gschemas"

RDEPENDS:${PN} += ""

inherit rpm
